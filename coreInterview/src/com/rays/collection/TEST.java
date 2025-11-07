package com.rays.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class TEST {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);

		System.out.println(list.get(2));
		System.out.println(list.set(2, 66));
		System.out.println(list.indexOf(300));
		System.out.println(list.subList(2, 4));

		LinkedList<Integer> l = new LinkedList<Integer>();

		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);

		l.peek();
		l.peekFirst();
		l.peekLast();

		l.get(2);
		l.getFirst();
		l.getLast();
		l.offerFirst(200);
		l.offerLast(700);
		System.out.println(l);

	}
}