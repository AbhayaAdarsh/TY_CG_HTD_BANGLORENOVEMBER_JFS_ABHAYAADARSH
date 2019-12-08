package com.cpg.staticandnonstatic;

public class Son  extends Father
{
	 Son()
	 {
		 
		 super("Maddy",40);
		 System.out.println("C");
	 }
	 Son(String name,int age)
	 {
		 this();
		 System.out.println("D");
	 }

}
