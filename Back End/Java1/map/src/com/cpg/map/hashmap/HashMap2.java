package com.cpg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 
{

	public static void main(String[] args)
	{				
		HashMap<Integer,Student> h1=new HashMap<Integer,Student>();

		h1.put(30, new Student(21,"Tia"));
		h1.put(25, new Student(24,"Sia"));
		h1.put(52, new Student(24,null));
		h1.put(null, null);
		h1.put(24, new Student(23,"Mia"));
		h1.put(25, new Student(24,"Sia"));

		Collection<Student> c1=h1.values();


		for (Student s1 : c1) 
		{
			System.out.println(s1);
			System.out.println("-------------------------");

		}
		Set<Integer> s2=h1.keySet();
		for(Integer i1:s2)
		{
			System.out.println(i1);
			System.out.println("-------------------------");
		}

		System.out.println(h1.containsKey(30));
		System.out.println("-------------------------");

		System.out.println(h1.containsValue(new Student(23,"Mia")));
		System.out.println("-------------------------");

		System.out.println(h1.isEmpty());
		System.out.println("-------------------------");

		System.out.println(h1.size());
		System.out.println("-------------------------");



	}
}
