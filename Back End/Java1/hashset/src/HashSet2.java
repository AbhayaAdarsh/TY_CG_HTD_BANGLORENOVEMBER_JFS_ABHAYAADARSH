import java.util.HashSet;

import hashset.Student;

public class HashSet2 
{
	public static void main(String[] args) 
	{
		HashSet<Student> hs=new HashSet<Student>();
		hs.add(new Student(52,"Joey"));
		hs.add(new Student(50,"Chandler"));
		
		hs.add(new Student(52,"Joey"));
		hs.add(new Student(50,"Chandler"));
		
		for (Student s1 : hs) 
		{
			System.out.println(s1.getName() + " and age is " +s1.getAge());
			
			
		}
	}
}
