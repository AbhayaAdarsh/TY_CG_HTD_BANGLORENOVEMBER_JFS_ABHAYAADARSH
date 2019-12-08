package armstromgnumber;

public class Program1 
{
	public static void main(String[] args)  
	{
		int num=371;
		int temp=num;
		int rem,sum=0,count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		while(num>0)
		{
			rem=num%10;
			int val=1;
			for(int i=1;i<=count;i++)
			{
				val=val*rem;
			}
			sum=sum+val;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Is a armstrong number");
		else
			System.out.println("Is not a armstrong number");
	}

}
