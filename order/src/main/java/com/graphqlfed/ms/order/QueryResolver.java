package com.graphqlfed.ms.order;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {
    public List<Order> getOrders(){
        Order order = new Order();
        order.setId("id_order");
        order.setItem("Phone");
        return List.of(order);
    }
}
