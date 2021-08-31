package com.example.assignment.vligtuig.service;

import com.example.assignment.vligtuig.model.VliegVield;
import com.example.assignment.vligtuig.model.Vliegtuig;
import org.springframework.stereotype.Service;

@Service
public interface VliegVieldService {
    public Iterable<VliegVield> getAllAirport();
    public VliegVield createNewOne(VliegVield vliegvield);
    public void delete(int id);
}
