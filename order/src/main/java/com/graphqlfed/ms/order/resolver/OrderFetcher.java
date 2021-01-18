package com.graphqlfed.ms.order.resolver;

import com.graphqlfed.ms.order.communication.Account;
import com.graphqlfed.ms.order.usecase.Order;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "ORDER_FETCHER")
public class OrderFetcher implements GraphQLResolver<Order> {
    public Account getAccount(Order order) {
        Account account = new Account();
        account.setId(order.getAccountId());
        return account;
    }
}
