package com.capgemini.forestrymanagement.springbootexception;

@SuppressWarnings("serial")
public class AdminException extends RuntimeException {

	public AdminException(String message) {
		super(message);
	}

	public void getMessage(String string) {
	}
}