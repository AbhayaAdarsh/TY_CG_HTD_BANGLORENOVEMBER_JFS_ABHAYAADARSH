package encapsulation;

public class TestPerson 
{

	public static void main(String[] args) 
	{
		Person p1=new Person();
		
		p1.setAge(20);
		p1.setName("Mon");
		
		
		System.out.println("Name of a person is "+p1.getName());
		System.out.println("Age of a person is "+p1.getAge());
	}
}
