package com.rays.corejavapractice;

public class armstrongno {
	public static void main(String[] args) {
		int num = 153;
		int num2 = num;
		int temp = 0;
		int r = 0;

		while (num2 != 0) {
			r = num2 % 10;
			temp = temp + r * r * r;
			num2 = num2 / 10;

		}
		if (temp == num) {
			System.out.println("is armstrong no");

		} else {
			System.out.println("is not armstong no ");
		}
	}
}
