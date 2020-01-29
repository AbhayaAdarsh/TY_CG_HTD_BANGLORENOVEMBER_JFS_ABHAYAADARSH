package com.capgemini.forestrymanagement.springbootdto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedular")
public class SchedularBean {
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private int schedulerId;
	@Column(nullable = false)
	private String schedulerName;
	@Column(nullable = false)
	private String schedulerPassword;
	@Column(nullable = false)
	private String deliveryDate;

	public Object getSchedulerName() {
		return null;
	}

	public void setSchedulerName(Object schedulerName2) {
	}

	public Object getSchedulerPassword() {
		return null;
	}

	public void setSchedulerPassword(Object schedulerPassword2) {
	}

	public Object getSchedulerId() {
		return null;
	}

	public void setSchedulerId(Object schedulerId2) {
	}

}
