package exceptionpropagation;

public class B 
{
	static void n()
	{
		try
		{
		C.m();
		}
		catch(ArithmeticException b)
		{
			System.out.println("B class"+b.getMessage());
			throw b;
		}
		
	}
}
