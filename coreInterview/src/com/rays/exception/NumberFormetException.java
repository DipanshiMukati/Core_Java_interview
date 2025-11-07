package com.rays.exception;

public class NumberFormetException {

	public static void main(String[] args) {

		String s = "dipanshi123";
		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}
