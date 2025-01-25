package com.example.restaurant.model;

import javax.persistence.*;

@Entity
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_item_id;
    private int order_id;
    private int dish_id;
    private int quantity;
    private double price;

    // Getters and Setters
}