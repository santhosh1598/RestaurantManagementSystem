package com.example.restaurant.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Reservations implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservation_id;

    @JsonProperty("restaurantId")
    private int restaurant_id;

    @JsonProperty("customerId")
    private int customer_id;

    @JsonProperty("tableId")
    private int table_id;

    @JsonProperty("reservationDate")
    private Date reservation_date;

    @JsonProperty("reservationTime")
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

    @Override
    public String toString() {
        return "Reservations{" +
                "reservation_id=" + reservation_id +
                ", restaurant_id=" + restaurant_id +
                ", customer_id=" + customer_id +
                ", table_id=" + table_id +
                ", reservation_date=" + reservation_date +
                ", reservation_time=" + reservation_time +
                '}';
    }
}