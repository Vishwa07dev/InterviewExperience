package com.interviewmiles.interviewExperience.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.interviewmiles.interviewExperience.model.InterviewExperience;

public interface InterviewExpRepository extends Repository<InterviewExperience, String> {

	InterviewExperience save(InterviewExperience interviewExperience);
	List<InterviewExperience> findAll() ;
	Optional<InterviewExperience> findOne(String id);
	void delete(InterviewExperience interviewExperience);
}
