package com.graphqlfed.ms.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
    private String id;
    private List<Order> orders;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addOrder(Order order){
        if(Objects.isNull(orders)){
            orders = new ArrayList<>();
        }
        orders.add(order);
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
