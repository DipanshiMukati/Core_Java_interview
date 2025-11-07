
package com.rays.exception;

public class StringIndexOutOfBound {
	public static void main(String[] args) {
		String s = "dipanshi";
		try {
				System.out.println(s.charAt(9));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}