package com.local.ms.restaurant.controller;

import com.local.ms.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;

@RestController
@FieldDefaults(makeFinal = true, level = PRIVATE)
@RequiredArgsConstructor
public class RestaurantController {
    RestaurantService restaurantService;

    // http://localhost:8080/test?text=salam
    @GetMapping("/test")
    public String getMessage(@RequestParam String text){
        return restaurantService.getMessage(text);
    }
}
