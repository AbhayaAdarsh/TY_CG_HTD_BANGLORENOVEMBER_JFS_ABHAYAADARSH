package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcexception;

@SuppressWarnings("serial")
public class ForestryException extends Exception {

	public ForestryException(String errorMessage) {
		super(errorMessage);
	}
}
