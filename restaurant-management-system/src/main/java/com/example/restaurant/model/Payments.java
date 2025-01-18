package com.example.restaurant.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_id;
    private int order_id;
    private Timestamp payment_date;
    @Enumerated(EnumType.STRING)
    private PaymentMethod payment_method;
    private double amount;

    public enum PaymentMethod {
        Cash, Card, Online
    }

    // Getters and Setters
}