package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> findByYear(
            @RequestParam(name = "year", required = false) Integer year,
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "age", required = false) Integer age,
            @RequestParam(name = "distillery", required = false) String distilleryName,
            @RequestParam(name = "region", required = false) String distilleryRegion) {

        if (year != null) {
            return new ResponseEntity<>(whiskyRepository.findByYear(year.intValue()), HttpStatus.OK);

        } else if (name != null) {
            return new ResponseEntity<>(whiskyRepository.findByName(name), HttpStatus.OK);

        } else if (age != null && distilleryName != null) {
                return new ResponseEntity<>(whiskyRepository.findByAgeAndDistilleryName(age.intValue(), distilleryName), HttpStatus.OK);

        } else if (distilleryRegion != null) {
                return new ResponseEntity<>(whiskyRepository.findByDistilleryRegion(distilleryRegion), HttpStatus.OK);

        } else {
                return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
            }
        }
}








