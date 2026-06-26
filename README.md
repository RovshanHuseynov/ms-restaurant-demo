# ms-restaurant-demo

A microservices demo application for practicing Hibernate (JPA), microservice architecture, Feign Client, and related patterns.

Overview
This project consists of two independent microservices that communicate via Feign Client:

Microservice - Responsibility
----------------------------
ms-restaurant - Manages restaurants, tables, and availability. 

ms-reservation - Manages reservations and their lifecycle



ms-restaurant
----------------
1. User could see all restaurants in app
2. User could see all tables with details
3. User could see all available slots for table for 24 hours


ms-reservation
----------------
1. User could reserve a table, in a future could reserve hotel room, concert ticket and more
2. User could cancel an existing reservation
3. If user is late more than 15 minutes of the reservation time, system should be automatically cancel the reservation.
4. If user came, restaurant admin approves the reservation




Tech Stack
-----------
1. Java / Spring Boot
2. Hibernate (JPA) — ORM and database interaction
3. Feign Client — inter-service communication
4. PostgreSQL (or your DB here)