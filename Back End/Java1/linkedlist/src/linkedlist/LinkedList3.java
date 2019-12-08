package linkedlist;

import java.util.LinkedList;

public class LinkedList3 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(15);
		l1.add(20);
		l1.add(25);
		l1.add(30);
		l1.add(35);
		l1.add(40);
		
		System.out.println(l1);
		System.out.println("----peek(),peekFirst(),peekLast()----");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println("******************************");
		System.out.println(l1);
		System.out.println("----poll(),pollFirst(),pollLast()----");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("******************************");

		LinkedList l2=new LinkedList<>();
		l2.add(30);
		l2.add(31);
        System.out.println(l2);
		System.out.println("----offer(),offerFirst(),offerLast()----");
		l2.offer(2);
		System.out.println(l2);
		l2.offerFirst(1);
		System.out.println(l2);
		l2.offerLast(4);
		System.out.println(l2);
		
	}
}
