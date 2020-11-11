package com.xworkz.queue;

import java.util.PriorityQueue;

public class QueueImplementation {

	public static void main(String[] args) {
		
		PriorityQueue<String> queueex=new PriorityQueue<String>();
		queueex.add("Six");
		queueex.add("Seven");
		queueex.add("Eight");
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		queue.add("Four");
		queue.add("Five");
		queue.add("Five");
		queue.offer("Six");
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		queue.addAll(queueex);
		System.out.println(queue);
		
		System.out.println("queue.element is :"+queue.element());
		
		queue.forEach((a)->System.out.println(a));
		
		queue.removeAll(queueex);
		System.out.println(queue);
		System.out.println("removing head of queue:"+queue.remove());
		System.out.println("removeif:"+queue.removeIf(a->(a!=null)));//return boolean
		
		
}
}