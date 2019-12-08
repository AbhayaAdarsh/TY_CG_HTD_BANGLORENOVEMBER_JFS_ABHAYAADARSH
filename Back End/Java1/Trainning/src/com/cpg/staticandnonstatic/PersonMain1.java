package com.cpg.staticandnonstatic;

public class PersonMain1 {
	public static void main(String[] args) 
	 {
		Person1 p1=new Person1();
		p1.age=22;
		p1.name="Rohan";
		p1.personDetails();
		
		Person1 p2=new Person1();
				p2.initialize(21,"Summer Sia");
	 }
}
