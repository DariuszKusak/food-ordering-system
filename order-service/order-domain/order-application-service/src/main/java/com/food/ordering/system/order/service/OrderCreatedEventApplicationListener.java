package com.food.ordering.system.order.service;

import com.food.ordering.system.order.service.domain.dto.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.ports.output.OrderCreatedPaymentRequestMessagePublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class OrderCreatedEventApplicationListener {
    private final OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher;

    public OrderCreatedEventApplicationListener(OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher) {
        this.orderCreatedPaymentRequestMessagePublisher = orderCreatedPaymentRequestMessagePublisher;
    }

    @TransactionalEventListener
    void process(OrderCreatedEvent orderCreatedEvent) {

    }
}
