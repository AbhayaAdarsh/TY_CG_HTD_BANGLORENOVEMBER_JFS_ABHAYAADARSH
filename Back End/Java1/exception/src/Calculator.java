
public class Calculator
{
	void divide(int a,int b)
	{
		System.out.println("Divide method is started");
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Don't divide by zero");
		}
		System.out.println("Divide method is ended");
	}
}
