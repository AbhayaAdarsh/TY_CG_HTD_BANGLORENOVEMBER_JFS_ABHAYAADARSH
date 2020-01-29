package com.capgemini.forestrymanagement.springbootdto;

import java.util.List;

public class ContractorResponce {

	private int statusCode;
	private String message;
	private String description;
	private List<AdminBean> beans;

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<AdminBean> getBeans() {
		return beans;
	}
	public void setBeans(List<AdminBean> beans) {
		this.beans = beans;
	}
}
