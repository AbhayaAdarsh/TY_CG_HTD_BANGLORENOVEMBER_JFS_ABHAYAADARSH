package com.cpg.interfaceconcept;

public class TestRobot
{
	public static void main(String[] args)
	 {
		Robot r1=new Robot();
		r1.move();
		r1.talk();
		System.out.println("-------------------------");
		Movement r2=new Robot();
		r2.move();
	 }
}
