package com.cg.multithreading.thread;

public class Irctc 
{
	synchronized void confirmTicket()
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println(i);
			
			try 
			{
				wait();
			} 
			catch (InterruptedException e1) 
			{
				System.out.println(e1.getMessage());
			}
//			try 
//			{
//				Thread.sleep(1000);
//			}
//			catch (InterruptedException e) 
//			{
//				System.out.println(e.getMessage());
//			}
		}
	}

	synchronized void leaveMe()
	{
		System.out.println("Notify called");
		notifyAll();
	}
}
