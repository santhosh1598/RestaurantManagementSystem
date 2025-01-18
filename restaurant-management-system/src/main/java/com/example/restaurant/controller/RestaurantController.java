package com.example.restaurant.controller;

import com.example.restaurant.model.Restaurants;
import com.example.restaurant.model.Tables;
import com.example.restaurant.service.RestaurantService;
import com.example.restaurant.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private TableService tableService;

    @GetMapping
    public Page<Restaurants> getAllRestaurants(Pageable pageable) {
        return restaurantService.getAllRestaurants(pageable);
    }

    @GetMapping("/{id}")
    public Map<String, Object> getRestaurantDetails(@PathVariable int id, Pageable pageable) {
        Restaurants restaurant = restaurantService.getRestaurantById(id);
        Page<Tables> availableTables = tableService.getTablesByRestaurantId(id, pageable).map(table -> {
            if (table.getStatus() == Tables.Status.Available) {
                return table;
            }
            return null;
        });

        return Map.of(
                "restaurant", restaurant,
                "availableTables", availableTables.getTotalElements(),
                "tables", availableTables.getContent()
        );
    }
}