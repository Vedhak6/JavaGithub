package com.xworkz.queue;

import java.util.PriorityQueue;

public class DoubleQueueImplementation {

	public static void main(String[] args) {
		
		PriorityQueue<Double> queueex=new PriorityQueue<Double>();
		queueex.add(5.7);
		queueex.add(6.7);
		queueex.add(7.7);
		PriorityQueue<Double> queue=new PriorityQueue<Double>();
		queue.add(1.1);
		queue.add(1.2);
		queue.add(1.3);
		queue.add(1.4);
		queue.add(1.5);
		queue.add(1.6);
		queue.offer(1.7);
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
