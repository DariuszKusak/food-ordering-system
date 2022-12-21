package com.food.ordering.system.order.service.domain.dto;

import com.food.ordering.system.order.service.domain.dto.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.dto.track.TrackOrderResponse;
import com.food.ordering.system.order.service.domain.dto.ports.input.service.OrderApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@RequiredArgsConstructor
@Slf4j
@Validated
@Service
class OrderApplicationServiceImpl implements OrderApplicationService {
    private final OrderCreateCommandHandler orderCreateCommandHandler;
    private final OrderTrackCommandHandler orderTrackCommandHandler;

    @Override
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
        return orderCreateCommandHandler.createOrder(createOrderCommand);
    }

    @Override
    public TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery) {
        return orderTrackCommandHandler.trackOrderResponse(trackOrderQuery);
    }
}
