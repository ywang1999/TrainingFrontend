package com.msclub.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msclub.training.dto.TrainingPlan;

public interface TrainingPlanResposity extends JpaRepository<TrainingPlan, Integer>{
		
}
