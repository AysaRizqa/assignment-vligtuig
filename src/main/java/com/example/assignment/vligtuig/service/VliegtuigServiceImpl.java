package com.example.assignment.vligtuig.service;

import com.example.assignment.vligtuig.model.Vliegtuig;
import com.example.assignment.vligtuig.repository.VliegtuigRepository;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class VliegtuigServiceImpl implements VliegtuigService {

    @Autowired
    VliegtuigRepository vliegtuigRepository;
    Vliegtuig vliegtuig;
    @Override
    public Iterable<Vliegtuig> getAllAirplane() {
        return this.vliegtuigRepository.findAll();
    }

    @Override
    public Vliegtuig createNewOne(Vliegtuig vliegtuig) {
        return this.vliegtuigRepository.save(vliegtuig);
    }

    @Override
    public void delete(int id) {
        Optional<Vliegtuig> airplane = this.vliegtuigRepository.findById(id);


        this.vliegtuigRepository.delete(vliegtuig);


    }

    @Override
    public Iterable<Vliegtuig> findAllAirplaneByThereType() {
         return this.vliegtuigRepository.findAllByTypeOfPlane(" Jumbo Passenger");
    }


}
