package com.msclub.training.model;

import java.sql.Date;

public class TrainingPlanDetail {

	private Integer id;
	private Integer trainingPlanId;
	private String trainingPlanName;
	private Date trainingPlanStartTime;
	private Date trainingPlanEndTime;
	private Integer creatorId;
	private String creator;
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
