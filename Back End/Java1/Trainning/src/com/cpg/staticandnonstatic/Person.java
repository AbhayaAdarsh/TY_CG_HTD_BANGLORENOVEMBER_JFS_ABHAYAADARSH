package com.cpg.staticandnonstatic;

public class Person
{
	static int age;
	 String name;
	 
	 void personDetails()
	 {
		System.out.println("Name of a person is "+ name + " and Age of a person is " +age);
	 }
	 static void personDetailsStatic()
	 {
		 System.out.println("Age of a person is "+age);
	 }
}
