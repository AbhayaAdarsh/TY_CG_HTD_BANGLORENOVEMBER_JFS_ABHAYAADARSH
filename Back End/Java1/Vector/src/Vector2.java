import java.util.Vector;

public class Vector2
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.addElement(21);
		v1.addElement(42);
		v1.addElement(63);
		v1.add(70);
		System.out.println(v1);
		v1.removeElement(new Integer(70));
		System.out.println(v1);
		System.out.println("----------------------");		 
        System.out.println("Conversion of collection into array is copyInto() ");
        Object[] o1=new Object[v1.size()];
        v1.copyInto(o1);
         for(int i=0;i<o1.length;i++)
         {
        	 System.out.println(o1[i]);
         }
		
         Vector v2=new Vector();
         v2.addElement(25);
         v2.addElement(50);
 		System.out.println("----------------------");		 
         System.out.println(v2.size());
         System.out.println(v2.capacity());
 		System.out.println("----------------------");		 
 
 		v2.trimToSize();
 		System.out.println(v2.size());
 		System.out.println(v2.capacity());
		System.out.println("----------------------");	
		v2.ensureCapacity(6);
		System.out.println(v2);
		System.out.println(v2.size());
        System.out.println(v2.capacity());
		System.out.println("----------------------");
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println(v2);
		System.out.println(v2.size());
        System.out.println(v2.capacity());
		System.out.println("----------------------");

	}
}
