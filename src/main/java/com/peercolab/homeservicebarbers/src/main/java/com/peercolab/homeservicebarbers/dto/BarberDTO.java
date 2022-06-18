package com.peercolab.homeservicebarbers.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class BarberDTO {

    @Id
    private Integer barber_id;
    private String first_name;
    private String last_name;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private Integer service_id;
}
