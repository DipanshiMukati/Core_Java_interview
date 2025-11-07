package com.rays.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<>();
//		 Queue<Integer> queue = new LinkedList<>(); // FIFO normal order

		queue.offer(100);  // offer() returns true, adds element
		queue.offer(200);  // offer() returns true
		queue.offer(30);   // offer() returns true
		queue.add(400);    // add() returns true, adds element
		System.out.println(queue);                                    
		// PriorityQueue: elements automatically sorted → [30, 100, 200, 400]

		System.out.println("queue.element() : " + queue.element()); // element() returns first element → 30
		System.out.println("queue.peek() : " + queue.peek());       // peek() returns first element → 30
		System.out.println(queue);                                   // prints queue → [30, 100, 200, 400]

		System.out.println("queue.poll() : " + queue.poll());       // poll() removes and returns first → 30
		System.out.println(queue);                                   // after poll → [100, 200, 400]

		System.out.println("queue.remove() : " + queue.remove());   // remove() removes and returns first → 100
		System.out.println(queue);                                   // after remove → [200, 400]

		System.out.println("queue.remove(200) : " + queue.remove(200)); // remove(object) removes 200 → returns true
		System.out.println(queue);                                       // after removing 200 → [400]
	}
}
//import java.util.*;
//
//public class OfferVsAdd {
//    public static void main(String[] args) {
//
//        // Fixed-size queue (capacity = 3)
//        Queue<Integer> q = new ArrayBlockingQueue<>(3);
//
//        System.out.println(q.offer(10)); // true
//        System.out.println(q.offer(20)); // true
//        System.out.println(q.offer(30)); // true
//        System.out.println(q.offer(40)); // ❌ queue full → false (safe)
//
//        // ab add() try karte hain
//        q = new ArrayBlockingQueue<>(3);
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.add(40); // ❌ queue full → throws IllegalStateException
//    }
//}
