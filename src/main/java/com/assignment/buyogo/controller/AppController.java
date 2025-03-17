package com.assignment.buyogo.controller;

import com.assignment.buyogo.entity.TrainingCenterEntity;
import com.assignment.buyogo.exceptionHandling.CustomException.DatabaseAccessException;
import com.assignment.buyogo.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private TrainingCenterService trainingCenterService;

    @PostMapping
    public ResponseEntity<TrainingCenterEntity> createTrainingCenter(@Valid @RequestBody TrainingCenterEntity trainingCenter) throws DatabaseAccessException {
        try{
            return new ResponseEntity<>(trainingCenterService.createCenter(trainingCenter), HttpStatus.CREATED);
        }catch (DatabaseAccessException e){
            throw e;
        }
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenterEntity>> getAllTrainingCenters() {
       try{
           return ResponseEntity.ok(trainingCenterService.getAllTrainingCenter());
       }catch (DatabaseAccessException e){
           throw e;
       }
    }
}
