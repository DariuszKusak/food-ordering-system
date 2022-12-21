package com.food.ordering.system.order.service.domain.dto.ports.input;

import com.food.ordering.system.order.service.domain.dto.dto.message.PaymentResponse;

public interface PaymentResponseMessageListener {
    void paymentCompleted(PaymentResponse paymentResponse);

    void paymentCancelled(PaymentResponse paymentResponse);
}
