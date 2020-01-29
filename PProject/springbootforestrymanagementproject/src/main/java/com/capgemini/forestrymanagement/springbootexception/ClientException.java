package com.capgemini.forestrymanagement.springbootexception;

@SuppressWarnings("serial")
public class ClientException extends RuntimeException {

	public ClientException(String message) {
		super(message);
	}

}
