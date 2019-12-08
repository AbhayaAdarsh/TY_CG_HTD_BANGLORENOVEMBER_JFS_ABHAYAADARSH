package com.cpg.exceptionpropagation;

public class D 
{
	static void o() throws ClassNotFoundException
	{
		Class.forName("A");
	}
}
