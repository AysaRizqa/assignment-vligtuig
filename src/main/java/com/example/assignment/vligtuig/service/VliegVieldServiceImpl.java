package com.example.assignment.vligtuig.service;

import com.example.assignment.vligtuig.model.VliegVield;
import com.example.assignment.vligtuig.model.Vliegtuig;
import com.example.assignment.vligtuig.repository.VliegvieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@SpringBootApplication

public class VliegVieldServiceImpl implements VliegVieldService {
    @Autowired(required=true)
    private VliegvieldRepository vliegvieldRepository;


    VliegVield vliegVield;
    @Override
    public Iterable<VliegVield> getAllAirport() {
        return this.vliegvieldRepository.findAll();
    }



    @Override
    public VliegVield createNewOne(VliegVield vliegVield) {
        return this.vliegvieldRepository.save(vliegVield);
    }


    @Override
    public void delete(int id) {
        Optional<VliegVield> airport = this.vliegvieldRepository.findById(id);

        this.vliegvieldRepository.delete(vliegVield);


    }
}
