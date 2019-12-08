package com.cpg.objectclass;

public class TestEmployee {
	public static void main(String[] args)
	{
		Employee e1=new Employee(21,"Dia");
		System.out.println(e1.hashCode());
		Employee e2=new Employee(21,"Tia");
		System.out.println(e2.hashCode());
		System.out.println(e2);
		Object o1=new Object();

	}
}
