package com.local.ms.restaurant.entity;

import com.local.ms.restaurant.enums.State;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.STRING;

@Entity(name = "restaurant_table")
public class Table {
    @Id
    private String id;
    private String name;
    private String number;
    private int sitCount;
    //private Restaurant restaurant;

    @Enumerated(STRING)
    private State state;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
