package collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 
{

	public static void main(String[] args)
	{
		Collection c1=new ArrayList();
		//adding all elements inside collection
		c1.add(10);
		System.out.println(c1);
		//finding the size of a collection
		System.out.println(c1.size());
		//checking whether collection is empty
		System.out.println(c1.isEmpty());
	    //removing the element from collection
		c1.remove(c1);
		System.out.println(c1);
		
		System.out.println(c1.contains(12));
	}
}
