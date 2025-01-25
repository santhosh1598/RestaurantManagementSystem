package com.example.restaurant.model;

import javax.persistence.*;

@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private int restaurant_id;
    private double salary;

    public enum Role {
        Chef, Waiter, Manager
    }

    // Getters and Setters
}