package com.peercolab.homeservicebarbers.service;

import com.peercolab.homeservicebarbers.dto.BarberDTO;
import com.peercolab.homeservicebarbers.entity.Barber;
import com.peercolab.homeservicebarbers.dto.mapper.BarberMapper;
import com.peercolab.homeservicebarbers.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberService {

    @Autowired
    private BarberMapper barberMapper;

    @Autowired
    private BarberRepository barberRepository;

    public ResponseEntity<Barber> saveBarberInfo(BarberDTO barberDTO) {
        return new ResponseEntity<>(barberRepository.save(
                barberMapper.dtoToModel(barberDTO)), HttpStatus.CREATED);
    }

    public ResponseEntity<List<BarberDTO>> getBarbersInfo(){
        return new ResponseEntity<>(barberMapper.modelsToDtos(barberRepository.findAll()), HttpStatus.OK);
    }

    public ResponseEntity<BarberDTO> getInfoById(long id){
        return new ResponseEntity<>(barberMapper.modelToDto(barberRepository.findById(id).get()), HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteInfoById(long id){
        BarberDTO barberDTO = barberMapper.modelToDto(barberRepository.findById(id).get());
        barberRepository.deleteById(barberDTO.getBarberId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
