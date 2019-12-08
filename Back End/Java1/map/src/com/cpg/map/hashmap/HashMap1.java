package com.cpg.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		
		h1.put(2, "Tina");
		h1.put(6, "Anjali");
		h1.put(4, "Rahul");
		h1.put(8, "Aman");
		h1.put(1, "Jenny");
		
		
		Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		
		for (Map.Entry<Integer, String> e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
		}
	}
}
