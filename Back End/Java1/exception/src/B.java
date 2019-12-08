public class B 
{
	void write()
	{
		String s1=null;
		try
		{
			System.out.println("Length of a string is "+s1.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Don't deal with null");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method is started");
		B b=new B();
		b.write();
		System.out.println("Main method is ended");
		
	}
}