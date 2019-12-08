package com.cpg.staticandnonstatic;

public class PersonMainClass {
	public static void main(String[] args) 
	 {
		Person p1=new Person();
		
		Person.age=24;
		p1.name="Mishti";
		p1.personDetails();
		p1.personDetailsStatic();
		
		Person p2=new Person();
		
		p2.name="Shanaya";
		p1.personDetails();
		p1.personDetailsStatic();
	 }
}
