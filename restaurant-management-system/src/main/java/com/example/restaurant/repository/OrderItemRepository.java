package com.example.restaurant.repository;

import com.example.restaurant.model.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItems, Integer> {
}