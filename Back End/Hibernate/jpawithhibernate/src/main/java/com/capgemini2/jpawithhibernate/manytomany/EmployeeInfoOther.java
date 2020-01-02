package com.capgimini.jpawithhibernate.manytomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import com.capgemini.jpawithhibernate.onetoone.EmployeeOther;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="EmployeeInfo")
public class EmployeeInfoOther 
{
@Id
@Column
private int eid;
@Column
private String name;
@Column
private String email;
@Exclude
@OneToOne(cascade=CascadeType.ALL,mappedBy="empInfo")
private EmployeeOther other;
}
