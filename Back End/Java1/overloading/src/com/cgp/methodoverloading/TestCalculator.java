package com.cgp.methodoverloading;

public class TestCalculator
{
	public static void main(String[] args) 
	 {
		Calculator c1=new Calculator();
		
		int s1=c1.add(25);
		System.out.println("Result 1 is "+s1);
		
		int s2=c1.add(60, 25, 15);
		System.out.println("Result 2 is "+s2);
		
		double s3=c1.add(45.50);
		System.out.println("Result 3 is "+s3);
		
		Calculator.multiply(24,2);
		Calculator.multiply(2.4);
	 }
}
