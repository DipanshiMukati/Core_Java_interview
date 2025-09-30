package com.rays.string;

public class ReverseOfString {
	public static void main(String[] args) {
		String name = "Sachin Jat";

		// Approach-1
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.print("");

//		length (sachin)6 : 6-1 = 5->4->3->2->1->0
				
	
		// Approach-2
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);

		}
		System.out.print("");

		// Approach-3
		StringBuilder sbuilder = new StringBuilder(name);
		System.out.println(sbuilder.reverse());

		// Approach-4
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
	}
}
