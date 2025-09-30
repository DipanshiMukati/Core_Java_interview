package com.rays.corejavapractice;

public class firstHigh {
	public static void main(String[] args) {
		int[] num = { 10, 90, 40, 50 };
		int b = 0;
		for (int i = 0; i < num.length; i++) {

			if (num[i] > b) {
				b = num[i];

			}

		}
		System.out.println(b);
	}
}
