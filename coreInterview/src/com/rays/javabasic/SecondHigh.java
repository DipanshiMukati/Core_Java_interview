package com.rays.javabasic;

public class SecondHigh {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40 };

		int first = 0;
		int second = 0;
//		int third = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > first) {

//				third = second;
				second = first;
				first = num[i];

			}

			if (second < num[i] && first > num[i]) {
				second = num[i];
			}
//			if (third < num[i] && second > num[i]) {
//
//				third = num[i];
//
//			}
		}
		System.out.println(first);
		System.out.println(second);
//		System.out.println(third);
	}

}