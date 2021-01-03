package com.graphqlfed.ms.order.resolver;

import com.graphqlfed.ms.order.usecase.GetOrderUsecase;
import com.graphqlfed.ms.order.usecase.Order;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {
    private final GetOrderUsecase getOrderUsecase;

    public List<Order> getOrders(String accountId){
        return getOrderUsecase.getOrderByAccount(accountId);
    }
}
