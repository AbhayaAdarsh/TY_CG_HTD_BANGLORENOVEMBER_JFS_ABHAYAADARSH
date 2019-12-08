
public class TestA
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		ExceptionA a1=new ExceptionA();
		a1.exception(0,"Ram");
		a1.exception(2, null);
		System.out.println("Main method ended");
	}
}
