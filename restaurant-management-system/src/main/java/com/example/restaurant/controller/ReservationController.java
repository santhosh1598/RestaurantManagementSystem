package com.example.restaurant.controller;

import com.example.restaurant.model.Reservations;
import com.example.restaurant.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public Page<Reservations> getAllReservations(Pageable pageable) {
        return reservationService.getAllReservations(pageable);
    }

    @GetMapping("/{id}")
    public Reservations getReservationById(@PathVariable int id) {
        return reservationService.getReservationById(id);
    }

    @PostMapping
    public Reservations createReservation(@RequestBody Reservations reservation) {
        return reservationService.saveReservation(reservation);
    }

    @PutMapping("/{id}")
    public Reservations updateReservation(@PathVariable int id, @RequestBody Reservations reservation) {
        Reservations existingReservation = reservationService.getReservationById(id);
        if (existingReservation != null) {
            reservation.setReservationId(id);
            return reservationService.saveReservation(reservation);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable int id) {
        reservationService.deleteReservation(id);
    }
}