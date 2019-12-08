package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2
{

	public static void main(String[] args)
	{
		LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		l1.add(12);
		l1.add(50);
		l1.add(null);
		l1.add(44);
		l1.add(60);
		l1.add(null);	
		 Iterator itr=l1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}
}
