package com.example.assignment.vligtuig.service;

import com.example.assignment.vligtuig.model.Vliegtuig;
import org.springframework.stereotype.Service;

@Service
public interface VliegtuigService {

    public Iterable<Vliegtuig> getAllAirplane();
   public Vliegtuig createNewOne(Vliegtuig vliegtuig);
    public void delete(int id);
    public Iterable<Vliegtuig> findAllAirplaneByThereType();
}
