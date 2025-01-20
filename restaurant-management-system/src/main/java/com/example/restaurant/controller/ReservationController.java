package com.example.restaurant.controller;

import com.example.restaurant.model.Reservations;
import com.example.restaurant.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private KafkaTemplate<String, Reservations> kafkaTemplate;

    private static final String TOPIC = "reservation_topic";

    @GetMapping
    public Page<Reservations> getAllReservations(Pageable pageable) {
        return reservationService.getAllReservations(pageable);
    }

    @GetMapping("/{id}")
    public Reservations getReservationById(@PathVariable int id) {
        return reservationService.getReservationById(id);
    }

    @PostMapping
    public String createReservation(@RequestBody Reservations reservation) {
        System.out.println("Reservation sent:"+reservation);
        kafkaTemplate.send(TOPIC, reservation);
        return "Reservation published to Kafka topic";
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