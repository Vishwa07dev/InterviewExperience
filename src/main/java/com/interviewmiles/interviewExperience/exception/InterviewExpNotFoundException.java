package com.interviewmiles.interviewExperience.exception;

public class InterviewExpNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public InterviewExpNotFoundException(String id){
	  super(String.format("No interview experience found with id :" , id));
  }
}
