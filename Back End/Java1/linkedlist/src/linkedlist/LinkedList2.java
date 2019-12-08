package linkedlist;

import java.util.LinkedList;

public class LinkedList2 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(20);
		l1.add(33);
		l1.add(13);
		l1.add(50);
		System.out.println(l1);
		System.out.println("---------------------");
		System.out.println("----Add first----");
		l1.addFirst(25);
		System.out.println(l1);
		System.out.println("----Add last----");
		l1.addLast(16);
		System.out.println(l1);
		l1.add(13);
		System.out.println("----remove first----");
		l1.removeFirstOccurrence(13);
		System.out.println(l1);
		System.out.println("---------------------");
		l1.add(20);
		System.out.println(l1);
		System.out.println("----remove last----");		
		l1.removeLastOccurrence(20);
		System.out.println(l1);
		System.out.println("----get first----");
		System.out.println(l1.getFirst());
		System.out.println("----get last----");
		System.out.println(l1.getLast());
		
		
	}

}
