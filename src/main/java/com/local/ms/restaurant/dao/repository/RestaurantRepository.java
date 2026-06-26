package com.local.ms.restaurant.dao.repository;

import com.local.ms.restaurant.dao.entity.RestaurantEntity;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<RestaurantEntity, String> {
}
