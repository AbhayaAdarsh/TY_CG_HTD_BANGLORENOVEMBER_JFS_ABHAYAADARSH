package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LandBean implements Serializable{
	private int landNo;
	private String landLordName;
	private String landDetails;
	private String tenantDetails;
	
	public int getLandNo() {
		return landNo;
	}
	public void setLandNo(int landNo) {
		this.landNo = landNo;
	}
	public String getLandlordName() {
		return landLordName;
	}
	public void setLandlordName(String landlordName) {
		this.landLordName = landlordName;
	}
	public String getLandDetails() {
		return landDetails;
	}
	public void setLandDetails(String landDetails) {
		this.landDetails = landDetails;
	}
	public String getTenantDetails() {
		return tenantDetails;
	}
	public void setTenantDetails(String tenantDetails) {
		this.tenantDetails = tenantDetails;
	}
	@Override
	public String toString() {
		return "LandBean [landNo=" + landNo + ", landlordName=" + landLordName + ", landDetails=" + landDetails
				+ ", tenantDetails=" + tenantDetails + "]";
	}
	public static void add(LandBean bean) {
	}
	public static void remove(LandBean bean) {
	}
	public static void contains(LandBean landBean2) {
	}
}