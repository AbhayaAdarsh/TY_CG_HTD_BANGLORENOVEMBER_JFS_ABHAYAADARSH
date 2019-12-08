package com.cg.multithreading.thread;

public class TestD 
{
	public static void main(String[] args)
	{
		System.out.println("Main method started");
		Irctc i1=new Irctc();
		User1 u1 = new User1(i1);
		u1.start();
		i1.leaveMe();

		User1 u2 = new User1(i1);
		i1.leaveMe();
		u2.start();

		
		System.out.println("Main method ended");
	}
}
