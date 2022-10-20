package com.peercolab.homeservicebarbers.dto.mapper;

import com.peercolab.homeservicebarbers.dto.ClientDTO;
import com.peercolab.homeservicebarbers.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDTO modelToDto(Client client);

    List<ClientDTO> modelsToDtos(List<Client> clients);

    Client dtoToModel(ClientDTO clientDTO);

    List<Client> dtosToModels(List<ClientDTO> clientDTOList);


}
