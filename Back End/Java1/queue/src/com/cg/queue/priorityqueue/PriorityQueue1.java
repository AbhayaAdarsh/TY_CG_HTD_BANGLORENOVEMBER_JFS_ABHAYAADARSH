package com.cg.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue1 
{

	public static void main(String[] args) 
	{
		PriorityQueue p1=new PriorityQueue();		
		p1.offer(76);
		p1.offer(12);
		p1.offer(52);
		p1.offer(44);
		p1.offer(36);
		System.out.println(p1);
		p1.poll();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1.peek());
		System.out.println("-------------------");
		System.out.println(p1.element());
		System.out.println("-------------------");
		for (Object o1 : p1) 
		{
			System.out.println(o1);
			
		}
	}
}
