package com.rays.corejavapractice;

public class SecHigh {

	public static void main(String[] args) {
		int[] num = { 60, 39, 84, 20 };

		int first = 0;
		int sec = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > first) {
				sec = first;
				first = num[i];

			}
			if (sec < num[i] && first > num[i]) {
				sec = num[i];

			}
		}
		System.out.println(sec);
//		System.out.println(first);

	}
}
