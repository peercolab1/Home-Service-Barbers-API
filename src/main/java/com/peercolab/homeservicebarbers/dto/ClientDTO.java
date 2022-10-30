package com.peercolab.homeservicebarbers.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    public Long clientId;
    public String firstName;
    public String lastName;
    public String phone;
    public String email;
    public String address;
    public String gender;
    public String city;
    public String state;
}
