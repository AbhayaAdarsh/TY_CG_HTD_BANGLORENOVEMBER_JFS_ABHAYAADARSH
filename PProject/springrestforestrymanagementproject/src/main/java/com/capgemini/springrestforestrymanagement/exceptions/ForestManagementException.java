package com.capgemini.springrestforestrymanagement.exceptions;

@SuppressWarnings("serial")
public class ForestManagementException extends RuntimeException {
	ForestManagementException(String message){
		super(message);
	}
}
