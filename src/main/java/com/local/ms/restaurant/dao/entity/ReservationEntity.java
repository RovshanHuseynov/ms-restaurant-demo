package com.local.ms.restaurant.dao.entity;

import com.local.ms.restaurant.model.enums.ReservationStatus;
import com.local.ms.restaurant.model.enums.State;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class ReservationEntity {
    @Id
    private String id;

    @OneToOne
    private UserEntity user;

    @OneToOne
    private TableEntity table;

    @OneToOne
    private RestaurantEntity restaurant;

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
