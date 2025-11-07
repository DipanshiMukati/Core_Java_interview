package com.collection.equalHashCode;

import java.util.*;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {

		EqualHashCode e1 = new EqualHashCode(101, "lokesh", 500);
		EqualHashCode e2 = new EqualHashCode(101, "lokesh", 500);

		// ========= 1️⃣ List.contains() =========
		System.out.println("\n========= List.contains()  =========");
		List<EqualHashCode> list = new ArrayList<>();
		list.add(e1);

		System.out.println("Checking if List contains e2...");
		boolean listResult = list.contains(e2);
		System.out.println("List result: " + listResult);

		// ========= List.remove() =========
		System.out.println("Removing e1 from List...");
		list.remove(e1);  // only equals() will be called
		System.out.println("List after remove: " + list);

		// ========= 2️⃣ Set.contains() =========
		System.out.println("\n========= Set.contains()  =========");
		Set<EqualHashCode> set = new HashSet<>();
		set.add(e1);

		System.out.println("Checking if Set contains e2...");
		boolean setResult = set.contains(e2);
		System.out.println("Set result: " + setResult);

		// ========= Set.remove() =========
		System.out.println("Removing e1 from Set...");
		set.remove(e1);  // hashCode() first, then equals()
		System.out.println("Set after remove: " + set);

		// ========= 3️⃣ Map.containsKey() =========
		System.out.println("\n========= Map.containsKey()  =========");
		Map<EqualHashCode, String> map = new HashMap<>();
		map.put(e1, "Lokesh");

		System.out.println("Checking if Map contains key e2...");
		boolean mapResult = map.containsKey(e2);
		System.out.println("Map result: " + mapResult);

		// ========= Map.remove() =========
		System.out.println("Removing e1 key from Map...");
		map.remove(e1);  // hashCode() first, then equals()
		System.out.println("Map after remove: " + map);
	}
}
