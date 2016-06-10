package com.interviewmiles.interviewExperience.service;

import java.util.List;

import com.interviewmiles.interviewExperience.model.InterviewExperience;

public interface InterviewExperienceService {
	InterviewExperience create(InterviewExperience interviewExperience);
	
	InterviewExperience delete(String id);
	
	List<InterviewExperience> findAll();
	
	InterviewExperience findById(String id);
	
	InterviewExperience update(InterviewExperience interviewExperience);

}
