package com.peercolab.homeservicebarbers.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Barber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long barberId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private Integer serviceId;
}
