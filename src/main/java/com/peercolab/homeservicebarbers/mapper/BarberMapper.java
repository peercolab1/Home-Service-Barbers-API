package com.peercolab.homeservicebarbers.mapper;

import com.peercolab.homeservicebarbers.model.Barber;
import com.peercolab.homeservicebarbers.dto.BarberDTO;
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
