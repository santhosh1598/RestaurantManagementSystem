package com.example.restaurant.model;

import javax.persistence.*;

@Entity
public class Dishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dish_id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;
    private double price;

    public enum Category {
        Appetizer, Main_Course, Dessert, Drink
    }

    // Getters and Setters
}