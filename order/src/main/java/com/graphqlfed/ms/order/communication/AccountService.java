package com.graphqlfed.ms.order.communication;

import com.graphqlfed.ms.order.usecase.GetOrderUsecase;
import com.graphqlfed.ms.order.usecase.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final GetOrderUsecase getOrderUsecase;

    public Account getAccount(String id){
        Account account = new Account();
        account.setId(id);
        account.setOrders(getOrderUsecase.getOrderByAccount(id));
        return account;
    }

}
