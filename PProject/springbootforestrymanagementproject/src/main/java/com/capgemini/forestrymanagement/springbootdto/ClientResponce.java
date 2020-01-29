package com.capgemini.forestrymanagement.springbootdto;

import java.util.List;

public class ClientResponce {
	private int statusCode;
	private String message;
	private String description;
	private List<ClientBean> beans;

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

	public List<ClientBean> getBeans() {
		return beans;
	}

	public void setBeans(List<ClientBean> beans) {
		this.beans = beans;
	}

}
