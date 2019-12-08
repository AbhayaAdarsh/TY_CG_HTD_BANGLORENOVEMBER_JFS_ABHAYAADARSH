package com.cg.multithreading.thread;

public class User1 extends Thread
	{
		Irctc i1;

		public User1(Irctc i1)
		{
			super();
			this.i1 = i1;
		}
		
		public void run()
		{
			i1.confirmTicket();
		}
}
