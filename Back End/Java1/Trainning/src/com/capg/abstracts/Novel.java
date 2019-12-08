package com.capg.abstracts;

public class Novel extends Book
{
	 Novel(String s) {
			super(s);
			System.out.println("Reading Books helps us to maintain our concentration power");
			 System.out.println("-----------------------------------------");
		}
	void write()
	 {
		System.out.println("Writing in books");
		 System.out.println("-----------------------------------------");
	 }
	 void scribble()
	 {
		 System.out.println("Whenever we are bored we can scribble in book.");
		 System.out.println("-----------------------------------------");
	 }
}
