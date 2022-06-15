package com.peercolab.homeservicebarbers.service;

import com.peercolab.homeservicebarbers.dto.BarberDTO;
import com.peercolab.homeservicebarbers.mapper.BarberMapper;
import com.peercolab.homeservicebarbers.entity.Barber;
import com.peercolab.homeservicebarbers.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BarberService {
    @Autowired
    private BarberMapper barberMapper;

    @Autowired
    private BarberRepository barberRepository;

    @PostMapping("/barbers")
    public ResponseEntity<Barber> save(@RequestBody BarberDTO barberDTO) {
        return new ResponseEntity<>(barberRepository.save(
                barberMapper.dtoToModel(barberDTO)), HttpStatus.CREATED);
    }

    @GetMapping("/barbers")
    public ResponseEntity<List<BarberDTO>> findAll(){
        return new ResponseEntity<>(barberMapper.modelsToDtos(barberRepository.findAll()), HttpStatus.OK);
    }

    @GetMapping("/barbers/{id}")
    public ResponseEntity<BarberDTO> findById(@PathVariable(value = "id") Integer id){
        return new ResponseEntity<>(barberMapper.modelToDto(barberRepository.findById(id).get()), HttpStatus.OK);
    }

    @DeleteMapping("/barbers/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "id") Integer id){
        BarberDTO barberDTO = barberMapper.modelToDto(barberRepository.findById(id).get());

        barberRepository.deleteById(barberDTO.getBarber_id());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
