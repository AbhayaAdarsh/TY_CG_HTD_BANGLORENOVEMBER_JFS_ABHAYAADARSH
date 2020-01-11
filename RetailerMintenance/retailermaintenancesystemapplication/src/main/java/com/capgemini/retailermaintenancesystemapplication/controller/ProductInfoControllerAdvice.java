package com.capgemini.retailermaintenancesystemapplication.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailermaintenancesystemapplication.dto.ProductInfoResponce;
import com.capgemini.retailermaintenancesystemapplication.exception.ProductInfoException;

@RestControllerAdvice
public class ProductInfoControllerAdvice {

	@ExceptionHandler(ProductInfoException.class)
	public ProductInfoResponce handleProductException(ProductInfoException e) {
	ProductInfoResponce productResponce = new ProductInfoResponce();
	productResponce.setStatusCode(501);
	productResponce.setMessage("Exception");
	productResponce.setDescription(e.getMessage());
	return productResponce;
}
}
