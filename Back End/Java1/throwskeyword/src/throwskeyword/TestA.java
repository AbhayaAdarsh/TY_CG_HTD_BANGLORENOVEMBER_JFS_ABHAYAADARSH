package throwskeyword;

public class TestA
{

	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		GoogleMap g1=new GoogleMap();
		Ola o1=new Ola(g1);
		o1.find(null);
		System.out.println("Main method ended");
	}
}
