package com.peercolab.homeservicebarbers.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

}
