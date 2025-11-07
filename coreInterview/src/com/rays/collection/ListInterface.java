package com.rays.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		// ================== ArrayList ==================
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // add() returns true
		list.add(200); // add() returns true
		list.add(300); // add() returns true
		list.add(400); // add() returns true
		System.out.println(list);
		System.out.println(list.get(2)); // get(index) returns element → 300
//		list.add(2, 222); // add(index, element) returns void
		System.out.println(list.indexOf(400)); // indexOf(element) returns index → 2
		System.out.println(list.subList(2, 4)); // subList(from,to) returns List → [222, 300]
		list.set(3, 55); // set(index, element) returns old element → 300
		System.out.println(list); // list print → [100, 200, 222, 55, 400]

		System.out.println("=====================================");

		// ================== LinkedList ==================
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10); // add() returns true
		l.add(20); // add() returns true
		l.add(30); // add() returns true
		l.add(40); // add() returns true

		System.out.println(l.element()); // element() returns first element → 10
		System.out.println(l.getFirst()); // getFirst() returns first element → 10
		System.out.println(l.getLast()); // getLast() returns last element → 40
		System.out.println(l.peek() + "pekkkk"); // peek() returns first element → 10
		System.out.println(l); // list print → [10, 20, 30, 40]
		System.out.println(l.peekFirst()); // peekFirst() returns first element → 10
		System.out.println(l.peekLast()); // peekLast() returns last element → 40
		System.out.println(l.offerFirst(120)); // offerFirst() returns true
		System.out.println(l.offerLast(150)); // offerLast() returns true
		System.out.println(l); // updated list → [120, 10, 20, 30, 40, 150]

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

		// ================== Stack ==================LIFO
		Stack<Integer> s = new Stack<Integer>();
		s.push(110); // push() returns element pushed → 110
		s.push(2); // push() → 2
		s.push(3); // push() → 3
		s.push(40); // push() → 4
		s.push(5); // push() → 5
		s.push(7); // push() → 7
		System.out.println(s);
		System.out.println(s.empty()); // empty() returns boolean → false
		System.out.println(s.peek() + "guggg"); // peek() returns top element → 7
		System.out.println(s.search(40) + "search"); // search() returns position from top → 4
		System.out.println(s.pop()); // pop() removes and returns top element → 7
		System.out.println(s + "endddddddddd"); // stack print → [110, 2, 3, 4, 5]

		System.out.println("=========+++++++++++++++++++++=====================");

		// ================== Vector ==================
		Vector<Integer> v = new Vector<Integer>();
		v.add(50); // add() returns true
		v.add(100); // add() returns true
		v.add(150); // add() returns true

		System.out.println(v.elementAt(2)); // elementAt(index) returns element → 150
		v.insertElementAt(75, 1); // insertElementAt(element,index) returns void
		System.out.println(v.subList(1, 3)); // subList(from,to) returns List → [75, 100]
		System.out.println("gggggggggg"+v);
		System.out.println(v.hashCode()); // hashCode() returns int
		System.out.println(v.size()); // size() returns int → 4
		System.out.println(v.capacity()); // capacity() returns int → 10 (default)
	}
}
