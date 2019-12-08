package com.cg.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 
{
	public static void main(String[] args) 
	{

		StudentName s1=new StudentName();
		StudentAge s2=new StudentAge();
		TreeMap<Student,String> t1=new TreeMap<Student,String>(s2);
		
		t1.put(new Student("Joe",6), "Std.1");
		t1.put(new Student("Mike",7), "Std.2");
		t1.put(new Student("George",8), "Std.3");
		
        Set<Map.Entry<Student,String> >s=t1.entrySet();
		
		for (Map.Entry<Student, String> e1 : s) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
			
		}


		
	}
}
