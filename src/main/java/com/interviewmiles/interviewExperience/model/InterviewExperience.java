package com.interviewmiles.interviewExperience.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class InterviewExperience {
	@Id
	private String id ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private Candidate candidate ;
	private String company ;
	private String designationApplied ;
	private String expectedSalary ;
	List<InterviewRound> interviewRounds ;
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDesignationApplied() {
		return designationApplied;
	}
	public void setDesignationApplied(String designationApplied) {
		this.designationApplied = designationApplied;
	}
	public String getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	public List<InterviewRound> getInterviewRounds() {
		return interviewRounds;
	}
	public void setInterviewRounds(List<InterviewRound> interviewRounds) {
		this.interviewRounds = interviewRounds;
	}
	
	

}
