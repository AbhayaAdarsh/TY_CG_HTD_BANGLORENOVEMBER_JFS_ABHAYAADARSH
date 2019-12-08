package com.cg.multithreading.thread;

public class TestC
{

	public static void main(String[] args) 
	{
		System.out.println("Main started");
		Pvr p=new Pvr();
		User u1=new User(p);
		
		u1.start();
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
		p.leaveMe();
		System.out.println("Main ended");
		
	}
}
