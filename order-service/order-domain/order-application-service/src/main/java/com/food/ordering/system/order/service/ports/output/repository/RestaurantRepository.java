package com.food.ordering.system.order.service.ports.output.repository;

import com.food.ordering.system.order.service.domain.dto.order.service.domain.enity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {
    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
