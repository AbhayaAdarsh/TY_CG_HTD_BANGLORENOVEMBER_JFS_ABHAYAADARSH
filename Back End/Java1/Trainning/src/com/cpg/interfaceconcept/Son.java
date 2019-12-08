package com.cpg.interfaceconcept;

import com.cpg.staticandnonstatic.Father;

public class Son extends Father
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
	public void home() {
		
	}
		
	 
	}


