package com.example.restaurant.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservation_id;
    private int restaurant_id;
    private int customer_id;
    private int table_id;
    private Date reservation_date;
    private Time reservation_time;

    // Getters and Setters
    public int getReservationId() {
        return reservation_id;
    }

    public void setReservationId(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public int getRestaurantId() {
        return restaurant_id;
    }

    public void setRestaurantId(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getTableId() {
        return table_id;
    }

    public void setTableId(int table_id) {
        this.table_id = table_id;
    }

    public Date getReservationDate() {
        return reservation_date;
    }

    public void setReservationDate(Date reservation_date) {
        this.reservation_date = reservation_date;
    }

    public Time getReservationTime() {
        return reservation_time;
    }

    public void setReservationTime(Time reservation_time) {
        this.reservation_time = reservation_time;
    }
}