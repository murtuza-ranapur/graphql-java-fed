package com.graphqlfed.ms.order.usecase;

import java.util.List;

public interface GetOrderUsecase {
    List<Order> getOrderByAccount(String accountId);
}
