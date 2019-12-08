package com.cpg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
		l1.put("BTM", 560072);
		l1.put("Hebbal",572104);
		l1.put(null, null);
		l1.put("BTR", 645213);
		l1.put("Rajajinagar", 786542);
		l1.put("BTM", 560072);

		l1.remove("Rajajinagar");
		
		Set<Map.Entry<String,Integer> >s1=l1.entrySet();
		
		for (Map.Entry<String, Integer> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
			
		}
		System.out.println(l1.containsKey("Hebbal"));
		System.out.println("-------------------------");

		System.out.println(l1.containsValue(572104));
		System.out.println("-------------------------");
		
		System.out.println(l1.isEmpty());
		System.out.println("-------------------------");
		
		System.out.println(l1.size());
		System.out.println("-------------------------");
		
	}

}
