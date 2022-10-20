package com.peercolab.homeservicebarbers.repository;

import com.peercolab.homeservicebarbers.entity.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<Barber, Long> {
}
