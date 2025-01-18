package com.example.restaurant.service;

import com.example.restaurant.model.Restaurants;
import com.example.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Page<Restaurants> getAllRestaurants(Pageable pageable) {
        return restaurantRepository.findAll(pageable);
    }

    public Restaurants getRestaurantById(int id) {
        return restaurantRepository.findById(id).orElse(null);
    }
}