package com.cg.multithreading.thread;

public class User extends Thread
{

	Pvr p;

	public User(Pvr p)
	{
		super();
		this.p = p;
	}
	public void run()
	{
		p.confirmTicket();
	}

}
