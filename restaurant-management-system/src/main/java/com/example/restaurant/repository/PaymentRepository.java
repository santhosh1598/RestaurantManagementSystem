package com.example.restaurant.repository;

import com.example.restaurant.model.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payments, Integer> {
}