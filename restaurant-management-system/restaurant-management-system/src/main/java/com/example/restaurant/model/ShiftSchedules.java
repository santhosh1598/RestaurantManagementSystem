package com.example.restaurant.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class ShiftSchedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schedule_id;
    private int employee_id;
    private Date shift_date;
    private Time shift_start_time;
    private Time shift_end_time;

    // Getters and Setters
}