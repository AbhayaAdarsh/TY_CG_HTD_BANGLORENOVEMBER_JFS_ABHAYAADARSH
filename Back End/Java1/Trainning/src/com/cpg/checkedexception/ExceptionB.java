package com.cpg.checkedexception;

public class ExceptionB 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Student s1=new Student();
		try
		{
		Object o1=s1.clone();
		Class c1=Class.forName("checkedException.Student");
		System.out.println("Clone supported");
		System.out.println("Class is found");
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clone not supported");
		}
		catch(ClassNotFoundException e2)
		{
			System.out.println("Class not found");
		}
		System.out.println("Main method ended");
	}

}
