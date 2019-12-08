package com.cpg.staticandnonstatic;

public class CalciMainClass
{
public static void main(String[] args) 
{
	ScientificCalculator sc=new ScientificCalculator();
	
	sc.add(10, 20);
	sc.subtract(40,20);
	sc.multiply(5, 2);
	sc.divide(80, 40);
	sc.modulus(8, 3);
	
}


}
