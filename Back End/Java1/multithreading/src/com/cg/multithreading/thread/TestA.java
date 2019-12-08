package com.cg.multithreading.thread;

public class TestA 
{

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Thread1 t1=new Thread1();
		t1.start();
		
		System.out.println("Main method ended");
	}
}
