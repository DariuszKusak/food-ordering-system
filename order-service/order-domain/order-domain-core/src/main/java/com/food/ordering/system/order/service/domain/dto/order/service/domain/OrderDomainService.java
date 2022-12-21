package com.food.ordering.system.order.service.domain.dto.order.service.domain;

import com.food.ordering.system.order.service.domain.dto.order.service.domain.enity.Restaurant;
import com.food.ordering.system.order.service.domain.dto.order.service.domain.event.OrderPaidEvent;
import com.food.ordering.system.order.service.domain.dto.order.service.domain.enity.Order;
import com.food.ordering.system.order.service.domain.dto.order.service.domain.event.OrderCancelledEvent;
import com.food.ordering.system.order.service.domain.dto.order.service.domain.event.OrderCreatedEvent;

import java.util.List;

public interface OrderDomainService {
    OrderCreatedEvent validateAndInitiate(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}
