package com.capg.abstracts;

	public abstract class Book 
	{
		static String s="Classmate";
		int number=3;
	 void read()
	 {
		 System.out.println("Reading books");
	 }
	 Book(String s)
	 {
		 System.out.println("Constructor is executed");
		 this.s=s;
		 System.out.println("-----------------------------------------");
	 }
	 static
	 {
		 s="Arun's";
		 System.out.println("Executing Static Initializer Block");
		 System.out.println("-----------------------------------------");
	 }
	 {
		 s="Chandra's";
		 System.out.println("Executing Instance Initializer Block ");
		 System.out.println("-----------------------------------------");
	 }
	 abstract void write();
	 abstract void scribble();
	 
}

