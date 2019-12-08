package checkedcustom;

public class AgeLimitException extends Exception
{
	String msg="Age should be more than 18 years";

	public AgeLimitException() 
	{
		super();
	}

	public AgeLimitException(String msg) 
	{
		super();
		this.msg = msg;
	}
	
	@Override
	public String getMessage()
	{
		return this.msg;
	}
	
}
