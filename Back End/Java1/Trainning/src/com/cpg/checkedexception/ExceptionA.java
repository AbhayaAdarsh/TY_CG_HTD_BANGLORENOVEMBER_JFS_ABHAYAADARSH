package com.cpg.checkedexception;

public class ExceptionA 
{

	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		try
		{
			Class c1=Class.forName("checkedException.Person");
			System.out.println("Class is found");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found");
		}
		System.out.println("Main method ended");
	}
}
