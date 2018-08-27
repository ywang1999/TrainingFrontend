package com.msclub.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclub.training.dto.TrainingPlan;
import com.msclub.training.model.TrainingPlanDetail;
import com.msclub.training.model.TrainingPlanResponse;
import com.msclub.training.service.TrainingPlanService;

@RestController
@RequestMapping("/training")
public class TrainingPlanController {

	@Autowired
	private TrainingPlanService trainingPlanService;

	@PostMapping("/plan")
	public TrainingPlanResponse getPlanHistorys() {

		List<TrainingPlan> trainingPlans = trainingPlanService.getTrainingPlans();
		TrainingPlanResponse response = new TrainingPlanResponse();
		List<TrainingPlanDetail> trainingPlanDetails = new ArrayList<TrainingPlanDetail>();
		for (TrainingPlan trainingPlan : trainingPlans) {
			TrainingPlanDetail trainingPlanDetail = new TrainingPlanDetail();
			trainingPlanDetail.setId(trainingPlan.getId());
			trainingPlanDetail.setTrainingPlanId(trainingPlan.getTrainingPlanId());
			trainingPlanDetail.setTrainingPlanName(trainingPlan.getTrainingPlanName());
			trainingPlanDetail.setTrainingPlanStartTime(trainingPlan.getTrainingPlanStartTime());
			trainingPlanDetail.setTrainingPlanEndTime(trainingPlan.getTrainingPlanEndTime());
			trainingPlanDetail.setCreatorId(trainingPlan.getCreatorId());
			trainingPlanDetail.setCreator(trainingPlan.getCreator());
			trainingPlanDetail.setCreateDate(trainingPlan.getCreateDate());
			
			trainingPlanDetails.add(trainingPlanDetail);
		}
		response.setTrainingPlanDetails(trainingPlanDetails);
		return response;
	}
}
