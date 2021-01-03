package com.graphqlfed.ms.order.usecase;

import com.graphqlfed.ms.order.communication.Account;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String id;
    private String item;
    private String accountId;
    private Account account;
}
