package com.local.ms.restaurant.dao.entity;

import com.local.ms.restaurant.model.enums.State;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

import static jakarta.persistence.EnumType.STRING;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tables")
public class TableEntity {
    @Id
    private String id;
    private String name;
    private String number;
    private int sitCount;

    @ManyToOne
    // @JoinColumn(name = "restaurants_id")
    private RestaurantEntity restaurant;

    @Enumerated(STRING)
    private State state;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableEntity that = (TableEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        //return Objects.hashCode(id);
        return getClass().hashCode();
    }
}
