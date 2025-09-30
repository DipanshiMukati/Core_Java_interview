package com.rays.string;

public class CountOccurrenceOfArray {

	public static void main(String[] args) {
		String[] names = { "Ddipu", "mukati" };

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (String name : names) {
				name = name.toLowerCase();
				for (int i = 0; i < name.length(); i++) {

					if (ch == name.charAt(i)) {
						count++;

					}
				}
			}
			if (count != 0) {
				System.out.println(ch + ":" + count);
			}

		}
	}
}
