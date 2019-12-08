package throwskeyword;

public class GoogleMap 
{
	void findLocation(String a)
	{
		try
		{
		System.out.println(a.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("Dear Google User,Plz fill the location name!");
			throw n;
		}
	}
}
