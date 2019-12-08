package com.cpg.staticandnonstatic;

public class TestIIB {
	public static void main(String[] args) 
	 {
		System.out.println("Pi value is "+InstanceBlock.PI);
		System.out.println("**************************************");
		 InstanceBlock i1=new InstanceBlock();
		System.out.println(i1.MAXIMUM);
		
		System.out.println("**************************************");
		
		InstanceBlock i2=new InstanceBlock(10);
		System.out.println(i2.MAXIMUM);
	 }
}
