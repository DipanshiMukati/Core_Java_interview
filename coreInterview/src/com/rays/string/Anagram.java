package com.rays.string;

import java.util.Arrays;

//same latter diff order
public class Anagram {
	public static void main(String[] args) {

		String d1 = "dipanshi";
		String d2 = "nshidipa";

		char[] ar1 = d1.toCharArray();
		char[] ar2 = d2.toCharArray();

		Arrays.sort(ar1);
		Arrays.sort(ar2);

		if (Arrays.equals(ar1, ar2)) {
			System.out.println(d1 + " " + d2 + " is a anagram");

		} else
			System.out.println(d1 + " " + d2 + " is not anagram");

	}

}
