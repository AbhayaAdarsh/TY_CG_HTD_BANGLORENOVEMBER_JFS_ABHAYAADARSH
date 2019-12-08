package com.cpg.interfaceconcept;

public interface Bottle
{
	static void close(){
		{
			System.out.println("Bottle is closed");
		}
	}
 void open();
 void drink();
 default void juice()
 {
	 System.out.println("Juice name is Pepsi");

 }
}
