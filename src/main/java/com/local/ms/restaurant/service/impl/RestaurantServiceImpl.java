package com.local.ms.restaurant.service.impl;

import com.local.ms.restaurant.service.RestaurantService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public String getMessage(String text) {
        return text;
    }
}
