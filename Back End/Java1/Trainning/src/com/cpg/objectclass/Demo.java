package com.cpg.objectclass;

public class Demo
{
	public static void main(String[] args) 
	{
		String s1="John";
		     System.out.println("s1 hashcode value is "+s1.hashCode());
		String s2="  John  ";
		       s1="Joey";
		String s3="John";
		       
		       System.out.println("s1 hashcode value is "+s1.hashCode());
		       System.out.println("s2 hashcode value is "+s2.hashCode());

		       System.out.println("s3 hashcode value is "+s3.hashCode());
	}

}
