
package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		Collection <Integer>c1 = new ArrayList<Integer>();

		System.out.println(c);
		c1.add(55);
		c1.add(50);
		System.out.println(c1);
		
		
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);

		System.out.println("hhhhh"+c.add(50));
		System.out.println(c);
		System.out.println(c.addAll(c1));
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.contains(10));
		System.out.println(c.containsAll(c1));
		System.out.println("hhhhh"+c);
		System.out.println(c.isEmpty());
		System.out.println(c.remove(10));
		System.out.println(c);
		System.out.println(c.removeAll(c));
		System.out.println(c);
		System.out.println(c1);
		c.clear();

		System.out.println(c);
	}
}