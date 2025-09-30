package com.rays.string;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		
		String name = "dipu";
//		char result = name.toUpperCase().charAt(0);
		String result = name.substring(0,1).toUpperCase() + name.substring(1);
		System.out.println(result);
	}
}
