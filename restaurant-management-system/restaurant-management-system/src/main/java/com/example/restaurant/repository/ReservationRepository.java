package com.example.restaurant.repository;

import com.example.restaurant.model.Reservations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservations, Integer> {
    Page<Reservations> findAll(Pageable pageable);
}