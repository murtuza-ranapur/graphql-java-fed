package com.graphqlfed.ms.order.usecase;

import com.graphqlfed.ms.order.entity.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j(topic = "ORDER_SERVICE")
public class OrderService implements GetOrderUsecase{
    private final OrderRepository repository;
    private final OrderMapper mapper;

    @Override
    public List<Order> getOrderByAccount(String accountId) {
        return mapper.toModels(repository.findAllByAccountId(accountId));
    }
}
