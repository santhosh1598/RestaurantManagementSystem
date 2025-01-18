package com.example.restaurant.model;

import javax.persistence.*;

@Entity
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int table_id;
    @Column(name = "restaurant_id")
    private int restaurantId;
    private int table_number;
    private int seating_capacity;
    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        Available, Reserved, Occupied
    }

    // Getters and Setters
    public int getTableId() {
        return table_id;
    }

    public void setTableId(int table_id) {
        this.table_id = table_id;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getTableNumber() {
        return table_number;
    }

    public void setTableNumber(int table_number) {
        this.table_number = table_number;
    }

    public int getSeatingCapacity() {
        return seating_capacity;
    }

    public void setSeatingCapacity(int seating_capacity) {
        this.seating_capacity = seating_capacity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}