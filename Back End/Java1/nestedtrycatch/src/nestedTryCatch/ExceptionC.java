package nestedTryCatch;

public class ExceptionC 
{
	public static void main(String[] args)
	{
		System.out.println("Main method started");
		Employee e1=new Employee();
		try
		{
			Object o1=e1.clone();
			System.out.println("Clone supported");
			try
			{
				Class c1=Class.forName("nestedTryCatch.Employee");
				System.out.println("Class found");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Class not found");
			}
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clone not supported");
		}
		System.out.println("Main method ended");
		
	}

}
