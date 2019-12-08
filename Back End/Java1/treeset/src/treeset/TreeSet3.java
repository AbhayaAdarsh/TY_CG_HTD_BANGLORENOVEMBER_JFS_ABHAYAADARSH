package treeset;

import java.util.TreeSet;

public class TreeSet3 
{

	public static void main(String[] args) 
	{
		EmployeeName e1=new EmployeeName();
		EmployeeAge e2=new EmployeeAge();
		EmployeeSalary e3=new EmployeeSalary();
		TreeSet<Employee> t1=new TreeSet<Employee>(e3);
		t1.add(new Employee(25,200000,"John"));
		t1.add(new Employee(22,35000,"Marshall"));
		t1.add(new Employee(29,500000,"Joshua"));

		t1.add(new Employee(26,40000,"John"));

		for (Employee e : t1) 
		{
			System.out.println("Employee age is "+e.age);
			System.out.println("Employee name is "+e.name);
			System.out.println("Employee salary is "+e.salary);
			System.out.println("**********************************");
		}
		
	}
}
