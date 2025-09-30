package com.rays.string;
//Ye program string me missing lowercase letters ko print karta hai.
public class StringPrintWithoutName {
	public static void main(String[] args) {
		String name = "dipanshi";

		char ch[] = name.toCharArray();

		for (char a = 'a'; a <= 'z'; a++) {
			int count = 0;
			for (char s : ch) {
				if (s == a) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(a);
			}
		}
	}

}