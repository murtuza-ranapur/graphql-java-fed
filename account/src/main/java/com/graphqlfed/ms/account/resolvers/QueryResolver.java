package com.graphqlfed.ms.account.resolvers;

import com.graphqlfed.ms.account.usecase.Account;
import com.graphqlfed.ms.account.usecase.GetAccountUsecase;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j(topic = "ACCOUNT_QUERY_RESOLVER")
public class QueryResolver implements GraphQLQueryResolver {
    private final GetAccountUsecase getAccountUsecase;

    public List<Account> getAccounts(){
        log.info("Fetching all accounts");
        return getAccountUsecase.getAllAccounts();
    }

    public Account getAccount(String id){
        log.info("Fetching account by id {}",id);
        return getAccountUsecase.getAccount(id);
    }

}
