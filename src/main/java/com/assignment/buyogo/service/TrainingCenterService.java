package com.assignment.buyogo.service;

import com.assignment.buyogo.entity.TrainingCenterEntity;
import com.assignment.buyogo.exceptionHandling.CustomException.DatabaseAccessException;

import java.util.List;

public interface TrainingCenterService {

    public TrainingCenterEntity createCenter(TrainingCenterEntity trainingCenter) throws DatabaseAccessException;

    public List<TrainingCenterEntity> getAllTrainingCenter()  throws DatabaseAccessException;
}
