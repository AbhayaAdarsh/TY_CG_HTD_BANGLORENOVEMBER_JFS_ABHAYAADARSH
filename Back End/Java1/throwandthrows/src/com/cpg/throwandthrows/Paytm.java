package com.cpg.throwandthrows;

public class Paytm
{

	Irctc i1;

	public Paytm(Irctc i1)
	{
		super();
		this.i1 = i1;
	}
	
	void bookTicket()
	{
		try
		{
			i1.confirmTicket();
			System.out.println("Ticket is booked");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Ticket is not booked");
		}
	}

}
