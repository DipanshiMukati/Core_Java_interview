package com.rays.javabasic;

public class Diamond1easy {

	public static void main(String[] args) {

//    	From chatgpt other way to print diamond
//    	  Upper part
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

        //  Lower part
        for (int i = 4; i >= 1; i--) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

	}
}