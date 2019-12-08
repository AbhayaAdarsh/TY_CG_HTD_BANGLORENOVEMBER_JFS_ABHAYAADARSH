package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3
{
	public static void main(String[] args)
	{
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee(21,"Rudra"));
		l1.add(new Employee(22,"Bhavya"));
		l1.add(new Employee(21,"Rudra"));
		 Iterator itr=l1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}

}
