package com.capgemini.forestrymanagement.springbootcontroller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.forestrymanagement.springbootdto.ProductResponce;
import com.capgemini.forestrymanagement.springbootexception.ProductException;

@RestControllerAdvice
public class ProductControllerAdvice {

	@ExceptionHandler(ProductException.class)
	public ProductResponce handleProductException(ProductException e) {
		ProductResponce productResponce = new ProductResponce();
		productResponce.setStatusCode(501);
		productResponce.setMessage("Exception");
		productResponce.setDescription(e.getMessage());
		return productResponce;
	}
}
