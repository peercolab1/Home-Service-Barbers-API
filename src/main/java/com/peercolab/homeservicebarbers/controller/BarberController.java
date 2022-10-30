package com.peercolab.homeservicebarbers.controller;

import com.peercolab.homeservicebarbers.dto.BarberDTO;
import com.peercolab.homeservicebarbers.entity.Barber;
import com.peercolab.homeservicebarbers.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BarberController {

    @Autowired
    private BarberService barberService;

    @PostMapping("/barber")
    public ResponseEntity<Barber> save(@RequestBody BarberDTO barberDTO) {
        return barberService.saveBarberInfo(barberDTO);
    }

    @GetMapping("/barbers")
    public ResponseEntity<List<BarberDTO>> findAll(){
        return barberService.getBarbersInfo();
    }

    @GetMapping("/barber/{id}")
    public ResponseEntity<BarberDTO> findById(@PathVariable(value = "id") long id){
        return barberService.getInfoById(id);
    }

    @DeleteMapping("/barber/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "id") long id){
        return barberService.deleteInfoById(id);
    }
}
