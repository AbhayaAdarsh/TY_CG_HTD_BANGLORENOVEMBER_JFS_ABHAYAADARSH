package com.capgemini.forestrymanagement.collectionbean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SchedularBean implements Serializable {
	private int schedulerId;
	private String schedulerName;
	private String schedulerPassword;
	private String role;
	private int customerid;
	private int productid;
	private String deliveryDate;
	
	public int getSchedulerId() {
		return schedulerId;
	}
	public void setSchedulerId(int schedulerId) {
		this.schedulerId = schedulerId;
	}
	public String getSchedulerName() {
		return schedulerName;
	}
	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}
	public String getSchedulerPassword() {
		return schedulerPassword;
	}
	public void setSchedulerPassword(String schedulerPassword) {
		this.schedulerPassword = schedulerPassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public static void add(SchedularBean bean) {
	}
	public void contains(SchedularBean schedularBean) {
	}
	public void setQuantity(int qty) {
	}	
}
