package com.cpg.staticandnonstatic;

public class Employee {
	String empName;
	 int empAge;
	 double empSalary;
	 Employee(String n,int a,double s)
	 {
		empName=n;
		empAge=a;
		empSalary=s;
		 
	 }
	 public void empDetails()
	 {
		 System.out.println("Name of an Employee is "+empName+ " and Age of an Employee is "+empAge +" Salary of an Employee is "+empSalary);

	 }
}
