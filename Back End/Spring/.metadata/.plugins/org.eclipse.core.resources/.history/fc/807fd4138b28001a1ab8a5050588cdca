package com.capgemini.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.springboot.dto.EmployeeResponce;
import com.capgemini.springboot.exception.EmployeeException;

@RestControllerAdvice 
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeException.class) //WE HANDEL EXCEPTION IN SPRING
	public EmployeeResponce handleEmployeeException(EmployeeException e) {
		EmployeeResponce responce=new EmployeeResponce();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setDiscription(e.getMessage());
		return responce;
	}
}
