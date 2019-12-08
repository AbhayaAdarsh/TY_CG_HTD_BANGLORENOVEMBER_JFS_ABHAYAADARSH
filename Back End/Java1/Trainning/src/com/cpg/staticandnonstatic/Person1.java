package com.cpg.staticandnonstatic;

public class Person1 {
	int age;
	 String name;
	 void personDetails()
	 {
		 System.out.println("Name of a person is "+name+ " and Age of a person is "+age);
	 }
	 void initialize(int a,String n)
	 {
		a= age;
		 n=name;
		 System.out.println("Name of a person is "+name+ " and Age of a person is "+age);

	 }
}
