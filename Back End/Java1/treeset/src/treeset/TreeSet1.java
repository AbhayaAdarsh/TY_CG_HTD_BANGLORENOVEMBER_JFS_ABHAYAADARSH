package treeset;

import java.util.TreeSet;

public class TreeSet1 
{
public static void main(String[] args)
{
	TreeSet t1=new TreeSet();
	t1.add(32);
	t1.add(12);
	t1.add(45);
	t1.add(32);
	
	t1.remove(45);
	for (Object o1 : t1)
	{
		System.out.println(o1);

	}
	
}

}
