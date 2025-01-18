package com.example.restaurant.service;

import com.example.restaurant.model.Reservations;
import com.example.restaurant.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Page<Reservations> getAllReservations(Pageable pageable) {
        return reservationRepository.findAll(pageable);
    }

    public Reservations getReservationById(int id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservations saveReservation(Reservations reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(int id) {
        reservationRepository.deleteById(id);
    }
}