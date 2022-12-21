package com.food.ordering.system.order.service.domain.dto.ports.input.service;

import com.food.ordering.system.order.service.domain.dto.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.dto.track.TrackOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
