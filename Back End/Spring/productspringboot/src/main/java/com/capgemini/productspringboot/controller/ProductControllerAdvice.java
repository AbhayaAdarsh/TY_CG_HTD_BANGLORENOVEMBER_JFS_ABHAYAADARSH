package com.capgemini.productspringboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.productspringboot.dto.ProductResponse;
import com.capgemini.productspringboot.exception.ProductException;


@RestControllerAdvice
public class ProductControllerAdvice {
	@ExceptionHandler(ProductException.class)
	public ProductResponse handleProductException(ProductException e) {
	ProductResponse productResponce = new ProductResponse();
	productResponce.setStatusCode(501);
	productResponce.setMessage("Exception");
	productResponce.setDescription(e.getMessage());
	return productResponce;
		
	}
		
}
