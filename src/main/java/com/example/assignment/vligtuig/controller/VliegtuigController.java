package com.example.assignment.vligtuig.controller;

import com.example.assignment.vligtuig.model.Vliegtuig;
import com.example.assignment.vligtuig.service.VliegtuigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/airplane/")
public class VliegtuigController {
    @Autowired
    private VliegtuigService vliegtuigService;


   /* @RequestMapping(value = "create", method = RequestMethod.POST)
    public Vliegtuig createNewOne(@RequestBody Vliegtuig vliegtuig) {
        return VliegtuigService.createNewOne(vliegtuig);
    }*/

    @RequestMapping("")
    public Vliegtuig createOne(@RequestBody Vliegtuig vliegtuig){
      return  this.vliegtuigService.createNewOne(vliegtuig);
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public Iterable<Vliegtuig> getAllairplane() {


        return this.vliegtuigService.getAllAirplane();
    }


    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void deletevliegtuig(@PathVariable int id) {
         this.vliegtuigService.delete(id);



    }
    @GetMapping("getAirplane")
    public Iterable<Vliegtuig> getAllproduct(){
        return this.vliegtuigService.findAllAirplaneByThereType();
    }









}
