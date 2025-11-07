
package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

	// If c1 and c2 have no elements in common, c1 becomes empty.
	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add(10);
		c1.add(20);
		c1.add('a');
		c1.add('b');
		c1.add("ehfh");
		

		Collection c2 = new ArrayList();
		c2.add(10);
		c2.add(200);
		c2.add('a');
		c2.add('c');

		System.out.println("c1 => " + c1);
		System.out.println("c2 => " + c2);

//		c2.retainAll(c1);
		c1.retainAll(c2);
		System.out.println("c1 => " + c1);
		System.out.println("c2 => " + c2);

	}

}
