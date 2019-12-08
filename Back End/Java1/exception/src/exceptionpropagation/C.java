package exceptionpropagation;

public class C 
{
	static void m()
	{
		try 
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException c)
		{
			System.out.println("C class"+c.getMessage());
			throw c;
		}
	}
}
