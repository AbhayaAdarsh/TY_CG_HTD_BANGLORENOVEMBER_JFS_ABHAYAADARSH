package com.capgemini.forestrymanagement.springbootcontroller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.forestrymanagement.springbootdto.AdminResponce;
import com.capgemini.forestrymanagement.springbootexception.AdminException;

@RestControllerAdvice
public class AdminControllerAdvice {
	@ExceptionHandler(AdminException.class)
	public AdminResponce handleProductException(AdminException e) {
		AdminResponce adminResponce = new AdminResponce();
		adminResponce.setStatusCode(501);
		adminResponce.setMessage("Exception");
		adminResponce.setDescription(e.getMessage());
		return adminResponce;

	}

}
