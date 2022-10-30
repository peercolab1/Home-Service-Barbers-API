package com.peercolab.homeservicebarbers.controller;

import com.peercolab.homeservicebarbers.dto.ClientDTO;
import com.peercolab.homeservicebarbers.entity.Client;
import com.peercolab.homeservicebarbers.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/client")
    public ResponseEntity<Client> save(@RequestBody ClientDTO clientDTO) {
        return clientService.saveClientInfo(clientDTO);
    }

    @GetMapping("/clients")
    public ResponseEntity<List<ClientDTO>> findAll() {
        return clientService.showAllClients();
    }
    @GetMapping("client/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable(value = "id") long id ) {
        return clientService.getInfoByID(id);
    }

    @DeleteMapping("/client/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "id") long id) {
        return clientService.deleteInfoById(id);
    }

}
