package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="emp_info")
public class EmployeeInfo {
@Id
@Column
private int id;
@Column
private String name;
@Column
private String email;
@Column
private String pwd;

@Exclude
@OneToOne(cascade=CascadeType.ALL,mappedBy="employee")
private EmployeeOther other;

public void setId(int i) {
	// TODO Auto-generated method stub
	
}

public void setName(String string) {
	// TODO Auto-generated method stub
	
}

public void setEmail(String string) {
	// TODO Auto-generated method stub
	
}

public Object getOther() {
	// TODO Auto-generated method stub
	return null;
}

public void setempid(int i) {
	// TODO Auto-generated method stub
	
}

public void setempname(String string) {
	// TODO Auto-generated method stub
	
}

public void setPassword(String string) {
	// TODO Auto-generated method stub
	
}


}

