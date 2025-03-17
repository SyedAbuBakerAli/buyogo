package com.assignment.buyogo.repository;

import com.assignment.buyogo.entity.TrainingCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenterEntity, Long> {
}
