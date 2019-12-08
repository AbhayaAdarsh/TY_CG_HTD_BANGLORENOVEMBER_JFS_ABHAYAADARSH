package com.cg.queue.priorityqueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeue1 
{

	public static void main(String[] args)
	{
		ArrayDeque<String> a1=new ArrayDeque<String>();
		a1.add("VA");
		a1.add("S");
		a1.add("VA");
		a1.add("Chan");
		System.out.println("------------------");
		a1.addFirst("Vai");
		a1.addLast("Navi");
		
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
        a1.remove();
        System.out.println(a1);
        System.out.println("------------------");
        a1.removeFirstOccurrence(a1);
        System.out.println(a1);
        System.out.println("------------------");
        System.out.println(a1.peek());
        System.out.println(a1.peekFirst());
        System.out.println(a1.peekLast());
        System.out.println("------------------");
        System.out.println(a1.poll());
        System.out.println(a1.pollFirst());
        System.out.println(a1.pollLast());
        
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
