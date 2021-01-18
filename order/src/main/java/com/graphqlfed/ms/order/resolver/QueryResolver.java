package com.graphqlfed.ms.order.resolver;

import com.graphqlfed.ms.order.usecase.GetOrderUsecase;
import com.graphqlfed.ms.order.usecase.Order;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j(topic = "ORDER_QUERY_RESOLVER")
public class QueryResolver implements GraphQLQueryResolver {
    private final GetOrderUsecase getOrderUsecase;

    public List<Order> getOrders(String accountId){
        log.info("Fetching orders for account {}", accountId);
        return getOrderUsecase.getOrderByAccount(accountId);
    }
}
