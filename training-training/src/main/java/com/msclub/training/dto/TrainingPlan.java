package com.msclub.training.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "TrainingPlan")
public class TrainingPlan implements Serializable {

	private static final long serialVersionUID = 1L;

	// `ID` int NOT NULL,
	@Id
	private Integer id;
	// @Column(name = "Training_Plan_ID")
	private Integer trainingPlanId;
	// @Column(name = "TRAINING_PLAN_NAME")
	private String trainingPlanName;
	// @Column(name = "TRAINING_PLAN_START_TIME")
	private Date trainingPlanStartTime;
	// @Column(name = "TRAINING_PLAN_END_TIME")
	private Date trainingPlanEndTime;
	// @Column(name = "CREATOR_ID")
	private Integer creatorId;
	// @Column(name = "CREATOR")
	private String creator;
	// @Column(name = "CREATE_DATE")
	private Date createDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTrainingPlanId() {
		return trainingPlanId;
	}
	public void setTrainingPlanId(Integer trainingPlanId) {
		this.trainingPlanId = trainingPlanId;
	}
	public String getTrainingPlanName() {
		return trainingPlanName;
	}
	public void setTrainingPlanName(String trainingPlanName) {
		this.trainingPlanName = trainingPlanName;
	}
	public Date getTrainingPlanStartTime() {
		return trainingPlanStartTime;
	}
	public void setTrainingPlanStartTime(Date trainingPlanStartTime) {
		this.trainingPlanStartTime = trainingPlanStartTime;
	}
	public Date getTrainingPlanEndTime() {
		return trainingPlanEndTime;
	}
	public void setTrainingPlanEndTime(Date trainingPlanEndTime) {
		this.trainingPlanEndTime = trainingPlanEndTime;
	}
	public Integer getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
