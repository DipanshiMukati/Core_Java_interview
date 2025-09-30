package com.rays.string;

public class CountOccuraceOfaChar {

	public static void main(String[] args) {
		String name = "ddddipanshi";
		int count = 0;
		
          char ch = 'd';
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println( ch+" " + count);
	}
}