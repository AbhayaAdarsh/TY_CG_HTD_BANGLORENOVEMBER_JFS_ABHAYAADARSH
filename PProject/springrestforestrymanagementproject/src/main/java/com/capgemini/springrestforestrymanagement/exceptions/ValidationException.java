package com.capgemini.springrestforestrymanagement.exceptions;

@SuppressWarnings("serial")
public class ValidationException extends RuntimeException{
	String message;
	public ValidationException() {

	}
	public ValidationException(String message){
		super();
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}	
}