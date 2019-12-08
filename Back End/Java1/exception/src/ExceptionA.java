
public class ExceptionA 
{
	void exception(int a,String b)
	{
		try
		{
		System.out.println(500/a);
		
		}catch(ArithmeticException e) 
		{
			System.out.println("Don't deal with 0");
		}
		try
		{
			System.out.println(b.length());
		}catch(NullPointerException n)
		{
			System.out.println("Don't deal with null");
		}
		
	}
}
