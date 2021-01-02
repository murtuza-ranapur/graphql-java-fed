package com.graphqlfed.ms.account;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public List<Account> getAccounts(){
        Account account = new Account();
        account.setId("id_1");
        account.setName("name");
        return List.of(account);
    }

    public Account getAccount(String id){
        Account account = new Account();
        account.setId("id_2");
        account.setName("account by id");
        return account;
    }

}
