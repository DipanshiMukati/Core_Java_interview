package com.rays.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {

		// ================== HashSet ==================
		HashSet<Integer> h = new HashSet<>();
		h.add(100);  // add() returns true
		h.add(200);  // add() returns true
		h.add(300);  // add() returns true
		h.add(400);  // add() returns true
		h.add(400);  // duplicate ignored, returns false

		System.out.println(h.contains(100)); // contains() returns boolean → true
		System.out.println(h.isEmpty());     // isEmpty() returns boolean → false
		System.out.println(h.size());        // size() returns int → 4
		System.out.println(h.remove(100));   // remove() returns boolean → true
		System.out.println(h);               // print set → [200, 300, 400] (order random)

		System.out.println("====================================");

		// ================== TreeSet ==================
		TreeSet<Integer> t = new TreeSet<>();
		t.add(10);  // add() returns true
		t.add(20);
		t.add(30);
		t.add(40);

		System.out.println(t.contains(10));     // contains() → true
		System.out.println(t.ceiling(40));     // ceiling(x) → smallest >= x → null
		System.out.println(t.first());           // first() → 10
		System.out.println(t.pollFirst());       // pollFirst() → removes and returns first → 10
		System.out.println(t.size());            // size() → 3
		System.out.println(t.pollLast());        // pollLast() → removes and returns last → 40
		System.out.println(t);                   // remaining set → [20, 30]

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

		// ================== LinkedHashSet ==================
		LinkedHashSet<Integer> l = new LinkedHashSet<>();
		l.add(1);   // add() returns true
		l.add(2);
		l.add(3);
		l.add(400);
		l.add(4);   // duplicate ignored, returns false

		System.out.println(l.contains(2));    // contains() → true
		System.out.println(l.isEmpty());      // isEmpty() → false
		System.out.println(l.size());         // size() → 4
		System.out.println("remove"+l.remove(400));      // remove() → true
		System.out.println(l);                // [1, 2, 3] insertion order maintained
		System.out.println("hashCode"+l.hashCode());     // hashCode() → int
		System.out.println(l.toArray());   
		System.out.println(Arrays.toString(l.toArray()));
// toArray() → Object[] → [1, 2, 3]
	}
}
