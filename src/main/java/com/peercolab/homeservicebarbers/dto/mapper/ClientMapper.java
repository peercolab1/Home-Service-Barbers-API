package com.peercolab.homeservicebarbers.dto.mapper;

import com.peercolab.homeservicebarbers.dto.ClientDTO;
import com.peercolab.homeservicebarbers.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ClientMapper extends EntityMapper<ClientDTO, Client>{

    ClientDTO toDto(Client entity);

    Client toEntity(ClientDTO dto);

    default Client fromId(Long id) {
        if (id == null) {
            return null;
        }
        Client client = new Client();
        client.setClientId(id);
        return client;
    }
}
