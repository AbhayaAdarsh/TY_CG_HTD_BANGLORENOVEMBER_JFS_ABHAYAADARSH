package com.capgemini.springboot.dto;

import java.util.List;
//POJO CLASS

public class EmployeeResponce {

	private int statusCode;
	private String message;
	private String discription;
	private List<EmployeeBean> beans;
	public int getStatusCode() {
		return statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;		
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public List<EmployeeBean> getBeans() {
		return beans;
	}
	public void setBeans(List<EmployeeBean> beans) {
		this.beans = beans;
	}
	
	
}
