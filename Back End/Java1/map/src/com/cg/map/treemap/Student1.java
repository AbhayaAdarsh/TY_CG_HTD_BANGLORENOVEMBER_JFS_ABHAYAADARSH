package com.cg.map.treemap;

public class Student1 implements Comparable<Student1>
{
	int age;
	String name;
	public Student1(int age, String name) 
	{
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student1 o) 
	{
		if (this.age > o.age)
			return 1;
		else if(this.age < o.age)
			return -1;
		else
		    return 0;
	}

	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	} 

}
