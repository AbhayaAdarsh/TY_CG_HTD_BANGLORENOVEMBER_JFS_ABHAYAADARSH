package com.capgemini.forestrymanagement.hibernatebean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class SchedularBean {
	@Id
	@Column
	private int schedulerId;
	@Column
	private int schedulerqty;
	@Column
	private int customerid;
	@Column
	private int productid;
	@Column
	private String deliveryDate;

	public int getSchedulerId() {
		return 0;
	}

	public void setschedulerId(int schedulerId1) {
	}

	public String getDeliveryDate() {
		return null;
	}

	public void setDeliveryDate(String dlvryDate) {
	}

	public int getCustomerId() {
		return 0;
	}

	public int getProductId() {
		return 0;
	}

	public void setProductId(int productid2) {
	}

	public String getSchedulerName() {
		return null;
	}

	public void setschedulerName(String schedulerName2) {
	}

	public int getschedularQuantity() {
		return 0;
	}

	public void setschedularQuantity(int schedularQuantity) {
	}
}
