package com.rays.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
	
	public static void main(String[] args) {

		// ================== SortedMap using TreeMap ==================
		SortedMap<Integer, String> s = new TreeMap<>();
		s.put(1, "one");    // put() returns null → new key added
		s.put(2, "two");    // put() returns null → new key added
		s.put(5, "three");  // put() returns null → new key added
		s.put(5, "one");    // put() returns old value → key 5 exists → replaced "three" with "one"
		s.put(4, "one");    // put() returns null → new key added

		// TreeMap keeps keys sorted automatically → [1=one, 2=two, 4=one, 5=one]

		System.out.println(s.lastKey());       
		// lastKey() → returns largest key → 5

		System.out.println(s.firstKey());      
		// firstKey() → returns smallest key → 1

		System.out.println(s.tailMap(2));      
		// tailMap(2) → returns SortedMap with keys >=2 → {2=two, 4=one, 5=one}

		System.out.println(s.headMap(5));      
		// headMap(5) → returns SortedMap with keys <5 → {1=one, 2=two, 4=one}

		System.out.println(s.entrySet());      
		// entrySet() → returns Set of all key-value pairs → [1=one, 2=two, 4=one, 5=one]

		System.out.println(s.subMap(2, 4));    
		// subMap(2,4) → returns SortedMap with keys >=2 and <4 → {2=two}
	}
}
