package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1
{
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		ListIterator ltr1 = l1.listIterator();
		while(ltr1.hasNext())
		{
			System.out.println(ltr1.next());
		}
		l1.add(null);
		l1.add(3);
		System.out.println(l1);
		l1.remove(new Integer(3));
		System.out.println(l1);
		System.out.println("----For Loop-----");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("----For each Loop----");
		for(Object i1:l1)
		{
			System.out.println(i1);
		}
		
		
	}
}
