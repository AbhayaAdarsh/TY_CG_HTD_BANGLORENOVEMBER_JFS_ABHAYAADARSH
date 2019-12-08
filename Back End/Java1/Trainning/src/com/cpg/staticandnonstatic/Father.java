package com.cpg.staticandnonstatic;

public class Father
{
	String fatherName;
	 int fatherAge;
	 
	 Father()
	 {
		 System.out.println("A");
	 }
	 protected Father(String name,int age)
	 {
		 this();
		 System.out.println("B");
	 }
}
