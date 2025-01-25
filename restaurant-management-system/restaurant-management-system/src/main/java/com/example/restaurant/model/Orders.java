package com.example.restaurant.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private Timestamp order_date;
    private int customer_id;
    private int restaurant_id;
    private double total_amount;
    @Enumerated(EnumType.STRING)
    private OrderStatus order_status;

    public enum OrderStatus {
        Pending, Completed, Cancelled
    }

    // Getters and Setters
}