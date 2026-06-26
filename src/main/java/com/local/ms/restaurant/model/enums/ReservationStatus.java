package com.local.ms.restaurant.model.enums;

public enum ReservationStatus {
    PENDING,    // new reservation
    CANCELLED,  // by user
    ARRIVED,    // approval by restaurant admin
    NO_SHOW,    // by system (if 16 minutes late)
    REJECTED    // by restaurant admin
}
