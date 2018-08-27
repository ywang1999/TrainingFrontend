package com.msclub.training.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.msclub.base.exception.DataNotFoundException;
import com.msclub.base.exception.TechnicalFailureException;
import com.msclub.training.dto.TrainingPlan;
import com.msclub.training.exception.TrainingExceptionCode;
import com.msclub.training.repository.TrainingPlanResposity;

@Service
public class TrainingPlanDomainImpl implements TrainingPlanDomain{
	
	@Autowired
	private TrainingPlanResposity trainingPlanResposity;
	
	@Override
	public List<TrainingPlan> getTrainingPlans() {
		try {
			List<TrainingPlan> trainingPlans = trainingPlanResposity.findAll();
			if (CollectionUtils.isEmpty(trainingPlans)) {
				throw new DataNotFoundException(TrainingExceptionCode.ERROR_010001);
			}
			return trainingPlans;
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainingExceptionCode.ERROR_010002, e);
		}
	}
}
