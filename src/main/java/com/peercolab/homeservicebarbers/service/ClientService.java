package com.peercolab.homeservicebarbers.service;


import com.peercolab.homeservicebarbers.dto.ClientDTO;
import com.peercolab.homeservicebarbers.dto.mapper.ClientMapper;
import com.peercolab.homeservicebarbers.entity.Client;
import com.peercolab.homeservicebarbers.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ClientRepository clientRepository;

    public ResponseEntity<Client> saveClientInfo(ClientDTO clientDTO) {
        return  new ResponseEntity<>(clientRepository.save(
                clientMapper.dtoToModel(clientDTO)), HttpStatus.CREATED);
    }

    public ResponseEntity<List<ClientDTO>> showAllClients() {
        return new ResponseEntity<>(clientMapper.modelsToDtos(clientRepository.findAll()), HttpStatus.OK);
    }

    public ResponseEntity<ClientDTO> getInfoByID(long id) {
        return new ResponseEntity<>(clientMapper.modelToDto(clientRepository.findById(id).get()), HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteInfoById(long id) {
        ClientDTO clientDTO = clientMapper.modelToDto(clientRepository.findById(id).get());
        clientRepository.deleteById(clientDTO.getClientId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
