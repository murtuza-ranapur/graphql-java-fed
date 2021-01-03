package com.graphqlfed.ms.order.communication;

import com.graphqlfed.ms.order.usecase.Order;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class Account {
    private String id;
    private List<Order> orders;

    public void addOrder(Order order){
        if(Objects.isNull(orders)){
            orders = new ArrayList<>();
        }
        orders.add(order);
    }
}
