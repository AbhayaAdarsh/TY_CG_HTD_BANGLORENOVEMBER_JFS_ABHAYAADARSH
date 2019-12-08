package linkedlist;

import java.util.LinkedList;

public class LinkedList4 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add("A");
		l1.add(null);
		l1.add(32);
		l1.add(40);
		System.out.println(l1);
		System.out.println("----Push operation----");
		l1.push(8);
		System.out.println(l1);
		System.out.println("----Pop operation----");
		l1.pop();
		System.out.println(l1);
		System.out.println("----Element operation----");
        System.out.println(l1.element());
		System.out.println(l1);
		
	}
}
