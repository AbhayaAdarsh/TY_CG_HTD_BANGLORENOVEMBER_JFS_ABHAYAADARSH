package customuncheckedexception;

public class DayLimitException extends RuntimeException
{
	String msg="Exceeds day limit";
	 
	 public DayLimitException()
	 {
		 
	 }
	 {
		 
	 }
	public DayLimitException(String msg) 
	{
		this.msg = msg;
	}
	public String getMsg() 
	{
		return msg;
	}
}
