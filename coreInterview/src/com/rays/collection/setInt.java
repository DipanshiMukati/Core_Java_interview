package com.rays.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setInt {
	public static void main(String[] args) {

 HashSet<Integer> h = new HashSet<Integer>();
// CARES
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);
		h.add(500);

		h.contains(1);
		h.remove(5);
		h.isEmpty();
		h.size();
	TreeSet<Integer> t = new TreeSet<Integer>();
//SCRFP
	t.size();
		t.contains(3);
		t.ceiling(200);
		t.pollFirst();
		t.pollLast();
		t.first();
		System.out.println(t);

	LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
//	CARE HAT
	s.contains(4);
		s.add(444);
		s.remove(4);
		s.isEmpty();
		s.hashCode();
		s.toArray();
	}
}
