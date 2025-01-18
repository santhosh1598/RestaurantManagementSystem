package com.example.restaurant.repository;

import com.example.restaurant.model.ShiftSchedules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftScheduleRepository extends JpaRepository<ShiftSchedules, Integer> {
}