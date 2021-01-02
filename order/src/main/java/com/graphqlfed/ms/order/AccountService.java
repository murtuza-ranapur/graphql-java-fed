package com.graphqlfed.ms.order;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account getAccount(String id){
        Account account = new Account();
        account.setId("id");

        Order order1 = new Order();
        order1.setId("One");
        order1.setItem("phone");

        Order order2 = new Order();
        order2.setId("Two");
        order2.setItem("buds");

        account.addOrder(order1);
        account.addOrder(order2);
        return account;
    }

}
