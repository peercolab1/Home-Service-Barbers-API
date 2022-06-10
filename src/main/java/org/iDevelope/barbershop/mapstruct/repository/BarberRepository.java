package org.iDevelope.barbershop.mapstruct.repository;

import org.iDevelope.barbershop.mapstruct.model.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<Barber, Integer> {
}
