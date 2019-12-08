package checkedcustom;

public class Person
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		
		Election e1=new Election();
		
		try
		{
			e1.vote(16);
		}
		catch(AgeLimitException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main method ended");
	}
}
