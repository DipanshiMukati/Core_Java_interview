package com.rays.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// ================== HashMap ==================
		HashMap<Integer, String> m = new HashMap<>();
		m.put(1, "a"); // put() returns null (new key)
		m.put(2, "b"); // put() returns null
		m.put(3, "c"); // put() returns null
		m.put(4, "d"); // put() returns null
		m.put(5, "e"); // put() returns null

		System.out.println(m.size()); // size() returns int → 5
		m.replace(2, "bb"); // replace() returns old value → "b"
		m.putIfAbsent(6, "f");
		System.out.println("222222222" + m);// putIfAbsent() returns null if key absent
		System.out.println(m.isEmpty()); // isEmpty() returns boolean → false
		System.out.println(m.get(5)); // get() returns value → "e"

		System.out.println(m.containsKey(4)); // containsKey() returns boolean → true
		System.out.println(m.containsValue("d")); // containsValue() returns boolean → true
		System.out.println(m);
		System.out.println("+++++++++++++++++++++++++++++++++");

		// ================== TreeMap ==================
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(1, "lokesh nikhil ka papa hay"); // put() returns null
		t.put(2, "nikhil ");
		t.put(3, "ilh");
		t.put(4, "dp");
		t.put(5, "e");

		System.out.println(t.firstKey()); // firstKey() returns smallest key → 1
		System.out.println(t.lastKey()); // lastKey() returns largest key → 5
		System.out.println(t.pollLastEntry()); // pollLastEntry() removes last entry → 5=e
		System.out.println(t.pollFirstEntry()); // pollFirstEntry() removes first entry → 1=lokesh nikhil ka papa hay
		System.out.println(t.higherKey(2)); // higherKey(2) returns next higher key → 3
		System.out.println(t.lowerKey(5)); // lowerKey(5) returns next lower key → 4
		System.out.println(t.firstEntry()); // firstEntry() returns Map.Entry → 2=nikhil
		System.out.println(t.lastEntry()); // lastEntry() returns Map.Entry → 4=dp

		System.out.println(t); // Remaining TreeMap → {2=nikhil , 3=ilh, 4=dp}

		System.out.println("==============================================");

		// ================== LinkedHashMap ==================
		LinkedHashMap<Integer, String> l = new LinkedHashMap<>();
		l.put(1, "kgn"); // put() returns null
		l.put(2, "jtn");
		l.put(3, "indore");
		l.put(2, "lokesh"); // key 2 exists → old value replaced
		l.put(5, "solan");
		System.out.println(l + "lllllllllll");
		l.replace(1, "new kgn"); // replace() returns old value → "kgn"
		l.remove(3);
		System.out.println("remove" + l);// remove() returns removed value → "indore"

		System.out.println(l.entrySet()); // entrySet() returns set of key-value pairs → [1=new kgn, 2=lokesh, 5=solan]
		System.out.println(l.keySet()); // keySet() returns keys → [1, 2, 5]
		System.out.println(l.values()); // values() returns values → [new kgn, lokesh, solan]
	}
}
