package com.cpg.staticandnonstatic;

public class Student1Main 
{
	 public static void main(String[] args) 
	 {
		Student1 s1=new Student1();
		System.out.println("Name is "+s1.studName);
		System.out.println("Age is "+s1.studAge);
		
		Student1 s2=new Student1("Karan",28);
		System.out.println("Name is "+s2.studName);
		System.out.println("Age is "+s2.studAge);
	 }
}
