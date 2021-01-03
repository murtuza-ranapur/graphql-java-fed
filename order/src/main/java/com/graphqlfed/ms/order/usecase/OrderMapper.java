package com.graphqlfed.ms.order.usecase;

import com.graphqlfed.ms.order.entity.OrderEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    List<Order> toModels(List<OrderEntity> orderEntities);
}
