package com.local.ms.restaurant.entity;

import com.local.ms.restaurant.enums.RestaurantStatus;
import com.local.ms.restaurant.enums.State;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import static jakarta.persistence.EnumType.STRING;

@Entity
public class Restaurant {
    @Id
    private String id;
    private String name;

    @Enumerated(STRING)
    private RestaurantStatus status;
    private LocalTime startTime;
    private LocalTime closeTime;

    private List<Table> tables;

    @Enumerated(STRING)
    private State state;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
