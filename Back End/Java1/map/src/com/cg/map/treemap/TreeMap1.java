package com.cg.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
		
		t1.put(153, "Hi");
		t1.put(172, "Bye");
		t1.put(160,"Hello");
		t1.put(50, null);
		t1.put(153, "Hi");
		
		t1.remove(172);
		
		Set<Map.Entry<Integer,String>> s1=t1.entrySet();
		
		for (Entry<Integer, String> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("----------------------");
			
		}
		System.out.println(t1.containsKey(153));
		System.out.println("-------------------------");

		System.out.println(t1.containsValue("Hello"));
		System.out.println("-------------------------");
		
		System.out.println(t1.isEmpty());
		System.out.println("-------------------------");
		
		System.out.println(t1.size());
		System.out.println("-------------------------");
	}
}
