package com.graphqlfed.ms.order.communication;

import com.graphqlfed.ms.order.usecase.GetOrderUsecase;
import com.graphqlfed.ms.order.usecase.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j(topic = "ACCOUNT_SERVICE")
public class AccountService {
    private final GetOrderUsecase getOrderUsecase;

    public Account getAccount(String id){
        log.info("Fetching order data for account {}",id);
        Account account = new Account();
        account.setId(id);
        account.setOrders(getOrderUsecase.getOrderByAccount(id));
        return account;
    }

}
