package com.cg.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3
{

	public static void main(String[] args) 
	{
		ArrayList<Student1> a1=new ArrayList<Student1>();
		a1.add(new Student1(6,"Chan"));
		a1.add(new Student1(6,"Rach"));
		ArrayList<Student1> a2=new ArrayList<Student1>();
		a2.add(new Student1(7,"Mon"));
		a2.add(new Student1(7,"Pheebs"));
		ArrayList<Student1> a3=new ArrayList<Student1>();
		a3.add(new Student1(8,"Ross"));
		a3.add(new Student1(8,"Joe"));
		
		TreeMap<String,ArrayList<Student1>> t1=new TreeMap<String,ArrayList<Student1>>();
		t1.put("1st Standard", a1);
		t1.put("2nd Standard", a2);
		t1.put("3rd Standard", a3);
		System.out.println(t1.get("1st Standard"));
		System.out.println(t1.get("2nd Standard"));
		System.out.println(t1.get("3rd Standard"));
		System.out.println("-------------------------");

		
       Set<Map.Entry<String, ArrayList<Student1>>>s=t1.entrySet();
		
		for (Map.Entry<String, ArrayList<Student1>> e1 : s)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
		}		
	}
}
