package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable{
	private String productName;
	private int productId;
	private String deliveryDate;
	private String deliveryDay;
	private int quantity;

	public ProductBean() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryDay() {
		return deliveryDay;
	}
	public void setDeliveryDay(String deliveryDay) {
		this.deliveryDay = deliveryDay;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductBean [productname=" + productName + ", productid=" + productId + "]";
	}
}
