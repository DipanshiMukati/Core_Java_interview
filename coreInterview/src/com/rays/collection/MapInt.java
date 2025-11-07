package com.rays.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInt {
//👉 “PRICES GK” = HashMap ke price ya GK (basic) methods

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(1, "b");
		map.put(1, "c");
		map.put(1, "d");
		map.put(1, "e");
		System.out.println(map.size());
		map.replace(2, "k");
		map.putIfAbsent(6, "o");
		System.out.println(map.isEmpty());
		System.out.println(map.get(5));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("d"));

	
//	FLPHLE 🧠 Trick: “First–Last–Poll–Higher–Lower–Entry”

	TreeMap<Integer, String> t = new TreeMap<>();
	t.put(1, "bharti");
	t.put(2, "nikil");
	t.put(2, "yyy");
	t.put(2, "hjklkl");
	t.put(2, "uyttui");
	System.out.println(t.firstKey());
	System.out.println(t.lastKey());
	System.out.println(t.pollFirstEntry());
	System.out.println(t.pollLastEntry());
	System.out.println(t.higherKey(2));
	System.out.println(t.lowerKey(3));
	
	System.out.println(t.firstEntry());
	System.out.println(t.lastEntry());
	System.out.println(t);
		
	
//	“Please Remember Rows Exist: Keys & Values” PRREKV
	LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();
	         l.put(1, "jjj");
	         l.replace(1, "dddd");
	         l.remove(1);
	         l.entrySet();
	         l.keySet();
	         l.values();
	         
	         
	
	}
}