package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestReverseArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(3);
		list.add(4);

		System.out.println("Original List: " + list);

		// Reverse manually
		List<Integer> reversed = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reversed.add(list.get(i));
		}
		System.out.println("Reversed List: " + reversed);
		 Collections.sort(list);
        System.out.println("Collections sort"+list);
//       Collections.reverse(l);
//        System.out.println("Collections"+l);
//        Collections.sort(l, Collections.reverseOrder());
//        System.out.println(l);

	}
}