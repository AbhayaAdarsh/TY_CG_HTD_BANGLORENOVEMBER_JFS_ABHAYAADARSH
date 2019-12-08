import java.util.HashSet;

public class HashSet1 
{
	public static void main(String[] args) 
	{
		HashSet hs1=new HashSet();
		hs1.add(23);
		hs1.add(86);
		hs1.add(12);
		hs1.add(44);
		for(Object o1:hs1)
		{
			System.out.println(o1);
		}
		System.out.println("------------------");
		HashSet hs2=new HashSet();
		hs2.add(23);
		hs2.add(86);
		hs2.add(12);
		hs2.add(44);
		hs2.add(null);
		hs2.add(null);
		for(Object o2:hs2)
		{
			System.out.println(o2);
		}
		System.out.println("------------------");
		HashSet<String> hs3=new HashSet<String>();
		hs3.add("A");
		hs3.add("AB");
		hs3.add("ABC");
		hs3.add(null);
		for(Object o3:hs3)
		{
			System.out.println(o3);
		}
		System.out.println("------------------");
	}

}
