package com.cgp.methodoverloading;

public class Calculator 
{
	int add(int m)
	 {
		 return m+m;
	 }
	 int add(int a,int b,int c)
	 {
		 return a+b+c;
	 }
	 double add(double a)
	 {
		 return a+a;
	 }
	 static void multiply(int a,int b)
	 {
		 System.out.println("Multiplication operation on a and b is "+(a*b));
	 }
	 static void multiply (double a)
	 {
		 System.out.println("Result 4 is "+(a*a));
	 }
}
