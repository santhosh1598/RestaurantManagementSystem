package com.example.restaurant.repository;

import com.example.restaurant.model.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dishes, Integer> {
}