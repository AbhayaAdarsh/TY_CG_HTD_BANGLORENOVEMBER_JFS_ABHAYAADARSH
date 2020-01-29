package com.capgemini.forestrymanagement.springbootexception;

@SuppressWarnings("serial")
public class CustomerException extends RuntimeException{
	
	public CustomerException(String message) {
		super(message);
	}

}
