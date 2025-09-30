package com.rays.javabasic;

public class Reverse {

	public static void main(String[] args) {
		int num = 1234;
		int temp = 0;
		int result = 0;
		while (num > 0) {
			temp = num % 10;
			result = (result * 10) + temp;
			num = num / 10;
		}
		System.out.println(result);

	}
}
