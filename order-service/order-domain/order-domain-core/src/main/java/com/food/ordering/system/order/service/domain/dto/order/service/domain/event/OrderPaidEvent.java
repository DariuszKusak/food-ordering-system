package com.food.ordering.system.order.service.domain.dto.order.service.domain.event;

import com.food.ordering.system.order.service.domain.dto.order.service.domain.enity.Order;

import java.time.ZonedDateTime;

public class OrderPaidEvent extends OrderEvent {
    public OrderPaidEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
