package collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2
{
	public static void main(String[] args) 
	{
		Collection c2=new ArrayList();
		c2.add(12);
		c2.add(13);
		c2.add(25);
		
		Collection c3=new ArrayList();
		c3.add(25);
		c3.add(28);
		System.out.println("Adding ");
		System.out.println(c2);
		System.out.println(c2.addAll(c3));
		System.out.println(c2);
		System.out.println("---------------------");
		System.out.println("Removing");
		System.out.println(c2.removeAll(c3));
		System.out.println(c2);
		System.out.println("---------------------");
		Collection c4=new ArrayList();
		c4.add(23);
		c4.add(25);
		c4.add(86);
		c4.add(98);
		
		Collection c5=new ArrayList();
		c5.add(25);
		c5.add(23);
		c5.add(12);
		c5.add(13);
		
		System.out.println("Retaining all elements");
		System.out.println(c4);
		System.out.println(c4.retainAll(c5));
		System.out.println(c4);
		System.out.println("-------------------------");
		System.out.println("Contains all elements");
		System.out.println(c4.containsAll(c5));
		System.out.println(c4);
		System.out.println("-------------------------");
		System.out.println("clearing elements");
		c4.clear();
		System.out.println(c4);
		System.out.println("-------------------------");
		System.out.println("toArray() collection methods");
		
		Collection c6=new ArrayList();
		c6.add(12);
		c6.add(13);
		Object a[]=c6.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
