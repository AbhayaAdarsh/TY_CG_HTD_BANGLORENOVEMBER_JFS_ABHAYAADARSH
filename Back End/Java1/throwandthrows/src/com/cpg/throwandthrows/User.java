package com.cpg.throwandthrows;

public class User 
{

	public static void main(String[] args) 
	{
		System.out.println("Main started");
		Irctc i1=new Irctc();
		Paytm p1=new Paytm(i1);
		p1.bookTicket();
		System.out.println("Main ended");
	}
}
