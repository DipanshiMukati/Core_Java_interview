package com.rays.string;

public class CountNoOfIntFromString {

	public static void main(String[] args) {

		String name = "dipanshi2005";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
//			if (Character.isLetter(name.charAt(i))) {
				if(Character.isLetterOrDigit(name.charAt(i))) {
					
			
//			if (Character.isDigit(name.charAt(i))) {
				count++;

			}
			

		}
		System.out.println("no of int from string"+count);

		
	}
}
