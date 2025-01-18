package com.example.restaurant.model;

import javax.persistence.*;

@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String name;
    private String email;
    private String phone_number;
    private String address;

    // Getters and Setters
}