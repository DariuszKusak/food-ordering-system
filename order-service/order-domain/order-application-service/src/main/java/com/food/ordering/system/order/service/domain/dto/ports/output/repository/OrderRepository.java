package com.food.ordering.system.order.service.domain.dto.ports.output.repository;

import com.food.ordering.system.order.service.domain.dto.order.service.domain.enity.Order;
import com.food.ordering.system.order.service.domain.dto.order.service.domain.value.object.TrackingId;

import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
