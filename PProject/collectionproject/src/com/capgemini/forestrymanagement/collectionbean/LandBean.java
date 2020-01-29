package com.capgemini.forestrymanagement.collectionbean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LandBean implements Serializable {
	private int landNo;
	private String landlordName;
	private String landDetails;
	private String tenantDetails;

	public int getLandNo() {
		return landNo;
	}

	public void setLandNo(int landNo) {
		this.landNo = landNo;
	}

	public String getLandlordName() {
		return landlordName;
	}

	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
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
		return "LandBean [landNo=" + landNo + ", landlordName=" + landlordName + ", landDetails=" + landDetails
				+ ", tenantDetails=" + tenantDetails + "]";
	}

	public static void add(LandBean bean) {
	}

	public static void remove(LandBean bean) {
	}

	public static void contains(LandBean landBean2) {
	}

	public void setDeliveryDate(String dlvryDate) {
	}

	public void setQuantity(int qty) {
	}
}
