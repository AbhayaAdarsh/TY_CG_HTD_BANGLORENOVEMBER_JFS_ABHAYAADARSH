package com.cpg.exceptionpropagation;

public class A
{
	public static void main(String[] args)
	{
		System.out.println("Main method started");
		
		try
		{
			B.m();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found but handled in A class");
		}
		System.out.println("Main  method ended");
	}
}
