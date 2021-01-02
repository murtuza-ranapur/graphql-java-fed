package com.graphqlfed.ms.account;

import com.apollographql.federation.graphqljava.Federation;
import com.apollographql.federation.graphqljava._Entity;
import graphql.TypeResolutionEnvironment;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class FederationConfiguration {
    @Autowired
    private AccountService accountService;

    @Bean
    public GraphQLSchema federationEnabled(SchemaParser schemaParser) {
        return Federation.transform(schemaParser.makeExecutableSchema())
                .fetchEntities(this::fetchEntities)
                .resolveEntityType(this::resolveEntityType)
                .build();
    }

    private Object fetchEntities(DataFetchingEnvironment dataFetchingEnvironment) {
        return dataFetchingEnvironment.<List<Map<String,Object>>>getArgument(_Entity.argumentName)
                .stream()
                .map( values -> {
                    if("Account".equals(values.get("__typename"))){
                        final Object id = values.get("id");
                        if(id instanceof String){
                            return accountService.getAccount((String) id);
                        }
                    }
                    return null;
                }).collect(Collectors.toList());
    }

    private GraphQLObjectType resolveEntityType(TypeResolutionEnvironment environment) {
        final Object src = environment.getObject();
        if(src instanceof Account){
            return environment.getSchema().getObjectType("Account");
        }
        return null;
    }
}
