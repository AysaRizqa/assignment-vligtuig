package com.example.assignment.vligtuig.repository;

import com.example.assignment.vligtuig.model.VliegVield;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VliegvieldRepository extends CrudRepository<VliegVield,Integer> {
}
