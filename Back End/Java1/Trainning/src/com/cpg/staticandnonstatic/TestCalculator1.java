package com.cpg.staticandnonstatic;

public class TestCalculator1 {
	public static void main(String[] args) 
	 {
		Calculator1 c1=new Calculator1();
		c1.add(10,20);
		
		//Final methods cannot be overridden by its child class
		//ScientificCalculator1 s1=new ScientificCalculator();
		//s1.add(20, 30);
	 }

}
