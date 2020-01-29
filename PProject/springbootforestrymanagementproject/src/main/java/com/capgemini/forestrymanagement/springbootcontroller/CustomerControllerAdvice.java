package com.capgemini.forestrymanagement.springbootcontroller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import com.capgemini.forestrymanagement.springbootdto.CustomerResponce;
import com.capgemini.forestrymanagement.springbootexception.CustomerException;

public class CustomerControllerAdvice {
	@ExceptionHandler(CustomerException.class)
	public CustomerResponce handleCustomerException(CustomerException e) {
		CustomerResponce customerResponce = new CustomerResponce();
		customerResponce.setStatusCode(501);
		customerResponce.setMessage("Exception");
		customerResponce.setDescription(e.getMessage());
		return customerResponce;
	}
}
