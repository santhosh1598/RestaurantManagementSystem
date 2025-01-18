package com.example.restaurant.service;

import com.example.restaurant.model.Tables;
import com.example.restaurant.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {

    @Autowired
    private TableRepository tableRepository;

    public Page<Tables> getTablesByRestaurantId(int restaurantId, Pageable pageable) {
        return tableRepository.findByRestaurantId(restaurantId, pageable);
    }
}