package com.rays.string;

public class AlbhabatPrint {

	public static void main(String[] args) {

		String name = "dipanshi";

		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			for (int i = 0; i < name.length(); i++) {

				if (ch == name.charAt(i)) {
//					System.out.println("a value is "+a);
					count++;
				}

			}

			if (count == 0) {
				System.out.println(ch + " " + count);
			}
				count = 0;


			
		}

	}
}





