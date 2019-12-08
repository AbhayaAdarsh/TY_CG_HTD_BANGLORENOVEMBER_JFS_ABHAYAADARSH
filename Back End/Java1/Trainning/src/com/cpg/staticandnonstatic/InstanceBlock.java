package com.cpg.staticandnonstatic;

public class InstanceBlock {
	final int MAXIMUM;
	 final static double PI;
	 
	  public InstanceBlock()
	  {
		  System.out.println("Constructor is executed");
		  this.MAXIMUM=100;
	  }
	  
	  {
		  System.out.println("Instance initializer block is executed");
	  }
	  
	  static
	  {
		  System.out.println("Static Initializer Block is executed");
		  PI=3.14152;
	  }
	  
	  public InstanceBlock(int a)
	  {
		  System.out.println("Constructor is overloaded");
		  this.MAXIMUM=400;
	  }
}
