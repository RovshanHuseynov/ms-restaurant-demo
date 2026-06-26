package com.local.ms.restaurant.service.concrete;

import com.local.ms.restaurant.service.abstraction.RestaurantService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public String getMessage(String text) {
        return text;
    }
}
