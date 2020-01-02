package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emp_other")
public class EmployeeOther {
@Id
@Column
private int id;
@Column
private String pancard;
@Column
private String fname;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="emp_id")
private EmployeeInfo employee;



}
