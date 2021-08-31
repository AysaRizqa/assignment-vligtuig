package com.example.assignment.vligtuig.controller;

import com.example.assignment.vligtuig.model.VliegVield;
import com.example.assignment.vligtuig.model.Vliegtuig;
import com.example.assignment.vligtuig.service.VliegVieldService;
import com.example.assignment.vligtuig.service.VliegtuigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("api/airport/")
    public class VliegVieldController {
        @Autowired
        private VliegVieldService vliegvieldService;


   /* @RequestMapping(value = "create", method = RequestMethod.POST)
    public Vliegtuig createNewOne(@RequestBody Vliegtuig vliegtuig) {
        return VliegtuigService.createNewOne(vliegtuig);
    }*/

        @RequestMapping("")
        public VliegVield createOne(@RequestBody VliegVield vliegVield){
            return  this.vliegvieldService.createNewOne(vliegVield);
        }

        @RequestMapping(value = "all", method = RequestMethod.GET)
        public Iterable<VliegVield> getAllairplanes() {


            return this.vliegvieldService.getAllAirport();
        }


        @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
        public void deletevlied(@PathVariable int id) {
            this.vliegvieldService.delete(id);



        }









    }


