package com.cpg.objectclass;

public class TestPerson {
	public static void main(String[] args) throws Throwable 
	 {
		System.out.println("-----Main method started-------");
		
		Person p1=new Person("Vaish");
//		p1=null;
//		System.gc();
		p1.finalize();
		System.out.println("-----Main method ended-------");

	 }
}
