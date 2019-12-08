package com.cg.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 
{

	public static void main(String[] args)
	{
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		p1.offer(new Student(21,"Tara"));
		p1.offer(new Student(20,"Sid"));
		
		for (Object object : p1)
		{
			System.out.println(object);
		}
	}
}
