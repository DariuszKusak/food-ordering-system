package com.food.ordering.system.order.service.ports.output;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.dto.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
