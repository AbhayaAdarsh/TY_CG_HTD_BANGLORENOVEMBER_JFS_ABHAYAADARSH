package com.cg.multithreading.thread;

public class Pvr 
{

	synchronized void confirmTicket()
	{
		for (int i = 0; i < 4; i++)
		{
			System.out.println(i);
//			try 
//			{
//				Thread.sleep(500);
//			} catch (InterruptedException e)
//			{
//				e.getMessage();
//			}
			try 
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	synchronized void leaveMe()
	{
		System.out.println("Notify called");
		notify();
	}
}
