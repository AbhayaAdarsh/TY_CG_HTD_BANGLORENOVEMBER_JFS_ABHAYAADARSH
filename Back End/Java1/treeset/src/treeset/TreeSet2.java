package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) 
	{
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(new Student(25,"John"));
		t1.add(new Student(22,"Marshall"));
		t1.add(new Student(29,"Joshua"));


		t1.add(new Student(25,"John"));

		Iterator itr=t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
