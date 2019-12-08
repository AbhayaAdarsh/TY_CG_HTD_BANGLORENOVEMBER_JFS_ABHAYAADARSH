package com.cpg.objectclass;

public class Demo5
{

	 public static void main(String[] args)
	 {
		Demo4 d1=new Demo4("Jiya",24);
		System.out.println("Age is "+ d1.getAge());
		System.out.println("Name is"+ d1.getName());
		System.out.println(d1.hashCode());
		 d1=new Demo4("Arsal",26);
			System.out.println("Age is "+d1.getAge());
			System.out.println("Name is"+d1.getName());
			System.out.println(d1.hashCode());

	 }
}
