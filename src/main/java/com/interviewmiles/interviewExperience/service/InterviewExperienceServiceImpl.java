package com.interviewmiles.interviewExperience.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmiles.interviewExperience.exception.InterviewExpNotFoundException;
import com.interviewmiles.interviewExperience.model.InterviewExperience;
import com.interviewmiles.interviewExperience.repository.InterviewExpRepository;

@Service
public class InterviewExperienceServiceImpl implements InterviewExperienceService{

	private final InterviewExpRepository repository ;
	
	@Autowired
	public InterviewExperienceServiceImpl(InterviewExpRepository repository) {
		this.repository=repository ;
	}
	
	@Override
	public InterviewExperience create(InterviewExperience interviewExperience) {
		InterviewExperience createdExp = repository.save(interviewExperience);
		return createdExp;
	}

	@Override
	public InterviewExperience delete(String id) {
		InterviewExperience experience = findById(id);
		repository.delete(experience);
		return experience;
	}

	@Override
	public List<InterviewExperience> findAll() {
		return repository.findAll();
	}

	@Override
	public InterviewExperience findById(String id) {
		Optional<InterviewExperience> experience = repository.findOne(id);
		return experience.orElseThrow(() -> new InterviewExpNotFoundException(id));
	}

	@Override
	public InterviewExperience update(InterviewExperience interviewExperience) {
		InterviewExperience experience = findById(interviewExperience.getId());
		experience.setCandidate(interviewExperience.getCandidate());
		experience.setCompany(interviewExperience.getCompany());
		experience.setDesignationApplied(interviewExperience.getDesignationApplied());
		experience.setExpectedSalary(interviewExperience.getExpectedSalary());
		experience.setInterviewRounds(interviewExperience.getInterviewRounds());
		experience= repository.save(experience);
		return experience;
	}

}
