package com.interviewmiles.interviewExperience.model;

public class Candidate {
	
	private String userId ;
	private String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String totalExperience ;
	private String typeOfInterview ;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(String totalExperience) {
		this.totalExperience = totalExperience;
	}
	public String getTypeOfInterview() {
		return typeOfInterview;
	}
	public void setTypeOfInterview(String typeOfInterview) {
		this.typeOfInterview = typeOfInterview;
	}
	
	

}
