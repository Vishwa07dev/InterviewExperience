package com.interviewmiles.interviewExperience.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.interviewmiles.interviewExperience.exception.InterviewExpNotFoundException;
import com.interviewmiles.interviewExperience.model.InterviewExperience;
import com.interviewmiles.interviewExperience.service.InterviewExperienceService;

@RestController
@RequestMapping("v1/api/interviewExperience")
public class InterviewExperienceController {

	private final InterviewExperienceService service;
	
	@Autowired
	public InterviewExperienceController(InterviewExperienceService service){
		this.service = service ;
	}
	
	@RequestMapping(method=RequestMethod.POST , consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	InterviewExperience createInterviewExp(@RequestBody @Valid InterviewExperience experience){
		return service.create(experience) ;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	List<InterviewExperience> findAllResume(){
		return service.findAll();
	}
	
	
	@RequestMapping(value="{id}" , method = RequestMethod.GET)
	InterviewExperience findById(@PathVariable("id") String id){
		return service.findById(id);
	}
	
	@RequestMapping(value="{id}" , method = RequestMethod.DELETE)
	InterviewExperience delete(@PathVariable("id") String id){
		return service.delete(id);
	}
	
	@RequestMapping(value="{id}" , method = RequestMethod.PUT)
	InterviewExperience update(@RequestBody @Valid InterviewExperience experience){
		return service.update(experience);
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleInterviewExpNotFound(InterviewExpNotFoundException ex){
		
	}
}
