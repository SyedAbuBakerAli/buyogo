package com.assignment.buyogo.service.serviceImpl;
import com.assignment.buyogo.entity.TrainingCenterEntity;
import com.assignment.buyogo.exceptionHandling.CustomException.DatabaseAccessException;
import com.assignment.buyogo.repository.TrainingCenterRepository;
import com.assignment.buyogo.service.TrainingCenterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {

    private final Logger logger = LoggerFactory.getLogger(TrainingCenterServiceImpl.class);

    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenterEntity createCenter(TrainingCenterEntity trainingCenter) throws DatabaseAccessException {
       try{
           return repository.save(trainingCenter);
       }catch (Exception e){
           logger.error("Fail to create Training Center: " + e.getMessage(), e);
           throw new DatabaseAccessException("Failed to create training center");
       }
    }

    public List<TrainingCenterEntity> getAllTrainingCenter() throws DatabaseAccessException {
       try{
           return repository.findAll();
       }catch (Exception e){
           logger.error("Fail to get Training Center: " + e.getMessage(), e);
           throw new DatabaseAccessException("Failed to retrieve training center");
       }
    }
}
