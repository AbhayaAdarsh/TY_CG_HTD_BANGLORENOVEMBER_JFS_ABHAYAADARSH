package customuncheckedexception;

public class ATMSimulator
{
	void withDraw(double amount)
	{
		if(amount>40000)
		{
			throw new DayLimitException();
		}
	}
}
