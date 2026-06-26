package com.local.ms.restaurant.dao.entity;

import com.local.ms.restaurant.model.enums.ReservationStatus;
import com.local.ms.restaurant.model.enums.State;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.*;

@Entity
public class Reservation {
    @Id
    private String id;

    private User user;   // reserved User
    private Table table;
    private Restaurant restaurant;
    private LocalDateTime startTime;     // reservation start time
    private LocalDateTime endTime;       // reservation end time

    @Enumerated(STRING)
    private ReservationStatus status;

    @Enumerated(STRING)
    private State state;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
