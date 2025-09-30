package com.rays.string;

public class StringMethodss {

	public static void main(String[] args) {

		String name = "dipanshi";
		String str = "mukati";

		int i = name.length();

		char ch = name.charAt(3);
		int s = name.indexOf(i);
		String s1 = name.toUpperCase();
		String s2 = name.toLowerCase();
		String s4 = name.concat(str);
		boolean s9 = name.endsWith("M");
		boolean s7 = name.startsWith("p");
		String s6 = name.trim();
		String s8 = name.substring(4);

		System.out.println(i);
	}
}