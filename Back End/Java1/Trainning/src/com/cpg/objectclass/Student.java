package com.cpg.objectclass;

public class Student {
	int age;
	 String name;
	 
	public Student(int age, String name) 
	{
		super();
		this.age = age;
		this.name = name;
	}
	 public String toString()
	 {
		 return " Student age is " +age+ " and Student name is "+name;
	 }
}
