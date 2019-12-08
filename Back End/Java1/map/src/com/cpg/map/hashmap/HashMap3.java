package com.cpg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap3 
{
	public static void main(String[] args)
	{				
		HashMap<Integer,String> h1=new HashMap<Integer,String>();

		h1.put(21,"Tia");
		h1.put(25,"Sia");
		h1.put(24,null);
		h1.put(null, null);
		h1.put(23,"Mia");
		h1.put(25,"Sia");
		
        Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		
		for (Map.Entry<Integer, String> e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
		}

		Collection<String> c1=h1.values();


		for (String s2 : c1) 
		{
			System.out.println(s2);
			System.out.println("-------------------------");

		}
		Set<Integer> s3=h1.keySet();
		for(Integer i1:s3)
		{
			System.out.println(i1);
			System.out.println("-------------------------");
		}

		System.out.println(h1.containsKey(30));
		System.out.println("-------------------------");

		System.out.println(h1.containsValue("Mia"));
		System.out.println("-------------------------");

		System.out.println(h1.isEmpty());
		System.out.println("-------------------------");

		System.out.println(h1.size());
		System.out.println("-------------------------");



	}
}
