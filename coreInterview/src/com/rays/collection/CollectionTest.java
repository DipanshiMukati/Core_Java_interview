package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	public static void main(String[] args) {

		Collection<Integer> c = new ArrayList<Integer>();
		Collection<Integer> c1 = new ArrayList<Integer>();

		c1.add(55);
		c1.add(10);
		System.out.println(c1);
		c.add(100);
		c.add(500);
		c.add(400);

		System.out.println(c.add(600));
		System.out.println("addAll" + c.addAll(c1));
		System.out.println("size" + c.size());
		System.out.println("isEmpty" + c.isEmpty());
		System.out.println("contains" + c.contains(10));
		System.out.println("containsAll" + c.containsAll(c1));
		System.out.println("remove" + c.remove(100));
		System.out.println("removeAll" + c.removeAll(c));
		System.out.println(c);
		c.clear();
		System.out.println(c);

	}
}