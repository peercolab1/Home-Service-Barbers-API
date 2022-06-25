package com.peercolab.homeservicebarbers.controller;

import com.peercolab.homeservicebarbers.dto.BarberDTO;
import com.peercolab.homeservicebarbers.entity.Barber;
import com.peercolab.homeservicebarbers.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BarberController {

    @Autowired
    private BarberService barberService;

    @PostMapping("/barbers")
    public ResponseEntity<Barber> save(@RequestBody BarberDTO barberDTO) {
        return barberService.saveBarberInfo(barberDTO);
    }

    @GetMapping("/barbers")
    public ResponseEntity<List<BarberDTO>> findAll(){
        return barberService.getBarbersInfo();
    }

    @GetMapping("/barbers/{id}")
    public ResponseEntity<BarberDTO> findById(@PathVariable(value = "id") Integer id){
        return barberService.getInfoById(id);
    }

    @DeleteMapping("/barbers/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "id") Integer id){
        return barberService.deleteInfoById(id);
    }
}
