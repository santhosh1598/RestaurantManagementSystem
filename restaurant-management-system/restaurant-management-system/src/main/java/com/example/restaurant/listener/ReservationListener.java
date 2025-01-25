package com.example.restaurant.listener;

import com.example.restaurant.model.Reservations;
import com.example.restaurant.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ReservationListener {

    @Autowired
    private ReservationService reservationService;

    @KafkaListener(topics = "reservation_topic", groupId = "group_id")
    public void consume(Reservations reservation) {
        reservationService.saveReservation(reservation);
        System.out.println("Consumed reservation: " + reservation);
    }
}