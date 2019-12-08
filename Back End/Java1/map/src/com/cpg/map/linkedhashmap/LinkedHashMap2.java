package com.cpg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(45, new Employee(30000,"Hari"));
		l1.put(12, new Employee(40000,"Ram"));
		l1.put(16, new Employee(25000,"Vishnu"));
		
		System.out.println(l1.get(12));
		
        Set<Map.Entry<Integer, Employee>>e1=l1.entrySet();
		
		for (Map.Entry<Integer, Employee> e2 : e1) 
		{
			System.out.println(e2.getKey());
			System.out.println(e2.getValue());
			System.out.println("-------------------------");
		}
		System.out.println(l1.containsKey(12));
		System.out.println("-------------------------");

		System.out.println(l1.containsValue(new Employee(25000,"Vishnu")));
		System.out.println("-------------------------");
		
		System.out.println(l1.isEmpty());
		System.out.println("-------------------------");
		
		System.out.println(l1.size());
		System.out.println("-------------------------");
		
	}
}
