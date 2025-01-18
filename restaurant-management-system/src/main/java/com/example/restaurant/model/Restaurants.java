package com.example.restaurant.model;

import javax.persistence.*;

@Entity
public class Restaurants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurant_id;
    private String name;
    private String location;
    private String contact_number;
    private String email;

    // Getters and Setters
    public int getRestaurantId() {
        return restaurant_id;
    }

    public void setRestaurantId(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contact_number;
    }

    public void setContactNumber(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}