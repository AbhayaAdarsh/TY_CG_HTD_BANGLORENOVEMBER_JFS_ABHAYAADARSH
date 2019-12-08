import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add(1);
		v1.add(11);
		v1.add(111);
		v1.add(1111);
		System.out.println(v1);
		System.out.println("----------------------");
		System.out.println(v1.size());
		 System.out.println(v1.capacity());
		 System.out.println("----------------------");
	         
		
	     System.out.println("For loop");
	     for(int i=0;i<v1.size();i++)
		{
	    	 System.out.println(v1.get(i));
		}
		 System.out.println("----------------------");
		 System.out.println(v1.set(1, 12));
	     System.out.println(v1); 
		 System.out.println("----------------------");		 

	     v1.setSize(10);
		 System.out.println(v1);
		 System.out.println("----------------------");		 
		 v1.trimToSize();
		 System.out.println(v1.size());
		 System.out.println(v1.capacity());
		 System.out.println("----------------------");
         v1.set(5, 54);
         System.out.println(v1);
		 System.out.println("----------------------");



	}
}
