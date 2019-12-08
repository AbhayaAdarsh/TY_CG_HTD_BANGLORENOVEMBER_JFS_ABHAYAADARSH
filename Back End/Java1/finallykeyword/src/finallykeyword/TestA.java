package finallykeyword;

public class TestA
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		try
		{
		System.out.println(500/0);
		}
		catch(ArithmeticException e)
		{
		System.out.println("Don't deal with zero");
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
		System.out.println("Main method ended");
		
	}

}
