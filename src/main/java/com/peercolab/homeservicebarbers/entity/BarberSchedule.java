package com.peercolab.homeservicebarbers.entity;

import javax.persistence.*;

@Entity
@Table(name = "barber_schedule")
public class BarberSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long barber_schedule_id;
}
