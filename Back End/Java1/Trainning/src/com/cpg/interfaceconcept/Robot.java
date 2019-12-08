package com.cpg.interfaceconcept;

public class Robot implements Movement,Sound
	{
	 public void move()
	 {
		 System.out.println("Robot is moving");
	 }
	 public void talk()
	 {
		 System.out.println("Robot is talking");
	 }
	}

