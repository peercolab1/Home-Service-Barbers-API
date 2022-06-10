package org.iDevelope.barbershop.mapstruct.mapper;

import org.iDevelope.barbershop.mapstruct.dto.BarberDTO;
import org.iDevelope.barbershop.mapstruct.model.Barber;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BarberMapper {

    BarberMapper INSTANCE = Mappers.getMapper(BarberMapper.class);

    BarberDTO modelToDto(Barber barber);

    List<BarberDTO> modelsToDtos(List<Barber> barber);

    Barber dtoToModel(BarberDTO barberDto);
}
