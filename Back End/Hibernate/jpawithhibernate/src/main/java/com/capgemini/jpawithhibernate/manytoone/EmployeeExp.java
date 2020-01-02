package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

import lombok.Data;

@Data
@Entity
@Table(name="emp_exp")
public class EmployeeExp {
	@Id
	@Column
private int expid;
	@Column
private String cname;
	@Column
private int noOfYear;
	
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="empid")
private EmployeeExp employee;

public void setexpid(int i) {
	// TODO Auto-generated method stub
	
}

public void setCompany(String string) {
	// TODO Auto-generated method stub
	
}

public void setNoOfYear(int i) {
	// TODO Auto-generated method stub
	
}

public void setEmployee(EmployeeInfo empi) {
	// TODO Auto-generated method stub
	
}



}
