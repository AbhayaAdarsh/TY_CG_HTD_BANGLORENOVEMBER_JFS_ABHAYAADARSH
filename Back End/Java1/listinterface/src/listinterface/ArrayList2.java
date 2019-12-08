package listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Joe");
		a1.add("Chan");
		a1.add("Ross");
		
		System.out.println(a1);
		System.out.println("----------------------");
		a1.remove(1);
		System.out.println(a1);
		System.out.println("----------------------");
		a1.add(1, "Mon");
		System.out.println(a1);
		System.out.println("----------------------");
   
		ArrayList <String> al1=new ArrayList <String>();
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}System.out.println("----------------------");
		
		for(String i1:a1)
		{
			System.out.println(i1);
		}
		System.out.println("----------------------");
		System.out.println("Iterator method");
		Iterator<String> itr =a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
        System.out.println("List Iterator method");
        
        ListIterator<String> itr1=a1.listIterator(a1.size());
        while(itr1.hasPrevious())
        {
        	System.out.println(itr1.previous());
        }
		System.out.println("----------------------");

		ArrayList <String> a2=new ArrayList <String>();
		a2.add("Derek");
		a2.add("Meredith");
		System.out.println(a2);
		a2.remove(new String("Meredith"));
		System.out.println(a2);
		System.out.println("----------------------");
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Joey");
		a3.add("Chandler");
		a3.add("Phoebe");
		System.out.println(a3);
		a2.retainAll(a3);
		
		System.out.println("----------------------");
		ArrayList<String> a4=new ArrayList<String>();
		a4.add("Joey");
		a4.add("Monica");
		a4.add("Phoebe");
		System.out.println(a3);
		a3.containsAll(a4);
		System.out.println(a3);
		System.out.println("----------------------");
		System.out.println(a3);
		System.out.println(a3.remove(1));
		System.out.println(a2);
		System.out.println("----------------------");

      a4.clear();
      System.out.println(a4);
		System.out.println("----------------------");
		System.out.println(a3);
		a3.set(1, "Rachel");
		System.out.println(a3);
		System.out.println("----------------------");

	}
}
