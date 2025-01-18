package com.example.restaurant.repository;

import com.example.restaurant.model.Restaurants;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurants, Integer> {
    Page<Restaurants> findAll(Pageable pageable);
}