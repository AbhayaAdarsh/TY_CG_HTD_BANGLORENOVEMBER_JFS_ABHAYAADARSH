package customuncheckedexception;

public class SbiAtm 
{
	public static void main(String[] args)
	{
		System.out.println("Main method started");
		ATMSimulator a1=new ATMSimulator();
		try
		{
		a1.withDraw(45000);
		}
		catch(DayLimitException e)
		{
			System.out.println(e.getMsg());
		}
		System.out.println("Main method ended");
	}
}
