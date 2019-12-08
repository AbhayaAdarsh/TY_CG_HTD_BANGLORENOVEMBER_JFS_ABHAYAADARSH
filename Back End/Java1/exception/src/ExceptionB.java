
public class ExceptionB 
{
	void exception(int a,String b)
	{
		try
		{
		System.out.println(500/a);
		try
			{
				System.out.println(b.length());
			}
			catch(NullPointerException e1)
			{
				System.out.println("Don't deal with null");
			}
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Don't deal with 0");
		}
	}

}
