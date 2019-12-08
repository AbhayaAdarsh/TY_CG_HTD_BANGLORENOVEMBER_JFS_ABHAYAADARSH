package boxingandunboxing;

public class A 
{
	public static void main(String[] args) 
	{
		int i1=10;
		double d1=20.24;
		//Boxing
		Integer i2=new Integer(i1);
		Double d2=new Double(d1);
		//UnBoxing
		int i3=i2.intValue();
		double d3=d2.doubleValue();
		
		System.out.println(i3);
		System.out.println(i2);
		System.out.println(i1);
		System.out.println("---------");
		System.out.println(d3);
		System.out.println(d2);
		System.out.println(d1);
		
	}
}
