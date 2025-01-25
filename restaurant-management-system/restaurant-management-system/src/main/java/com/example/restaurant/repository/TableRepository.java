package com.example.restaurant.repository;

import com.example.restaurant.model.Tables;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Tables, Integer> {
    Page<Tables> findByRestaurantId(int restaurantId, Pageable pageable);
}