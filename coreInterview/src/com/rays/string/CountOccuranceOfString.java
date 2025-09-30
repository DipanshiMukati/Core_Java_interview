package com.rays.string;

public class CountOccuranceOfString {

	public static void main(String[] args) {

		String name = "Dippanshi";

		for (char ch = 'a'; ch <= 'z'; ch++) {
//			name = name.toLowerCase();
			int count = 0;

			for (int i = 0; i < name.length(); i++) {
				if (ch == name.charAt(i)) {
//					System.out.println("a value is "+a);
					count++;
				}
			}
			if (count != 0) {
				System.out.println(ch + " " + count);

			}

		}
	}
}