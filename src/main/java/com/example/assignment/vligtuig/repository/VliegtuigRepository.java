package com.example.assignment.vligtuig.repository;

import com.example.assignment.vligtuig.model.Vliegtuig;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VliegtuigRepository extends CrudRepository <Vliegtuig,Integer> {
    Iterable<Vliegtuig> findAllByTypeOfPlane(String name);
}
