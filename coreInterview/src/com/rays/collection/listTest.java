package com.rays.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class listTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		System.out.println(list);
		System.out.println("get" + " " + list.get(2));

		System.out.println("sub" + " " + list.subList(2, 4));
		System.out.println("set" + " " + list.set(3, 30));
		list.add(2, 222);
		System.out.println("index" + " " + list.indexOf(222));

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l.add(50));
		l.peek();   
		l.peekFirst();
		l.peekLast();
		l.element();
		l.get(2);
		l.getFirst();
		l.getLast();
		l.offerFirst(200);
		l.offerLast(399);

		System.out.println(l);

		Stack<Integer> s = new Stack<Integer>();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		System.out.println(s.push(500));

		System.out.println(s.peek());
		
		System.out.println(s.pop()+" uuuuuuuuu");
		s.empty();
		s.search(100);
		System.out.println(s);

		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		System.out.println(v.add(200));
		v.elementAt(2);
		v.insertElementAt(2, 4);
		v.hashCode();
		v.size();
		v.capacity();
		System.out.println(v);
	}

}
