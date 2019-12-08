
public class C 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		
		int[] a=new int[2];
		
		a[0]=10;
		a[1]=20;
		try {
		a[2]=30;
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println("No size to store the data");
		}
		System.out.println("Main method ended");
		
	}
}
