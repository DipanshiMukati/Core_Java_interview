package com.rays.corejavapractice;

public class MethodCalling {
	public static void main(String[] args) {
		int[] arr = { 10, 90, 70, 69 };
		int num = 90;
		int index = index(arr, num);
		System.out.println(index);
	}

	public static int index(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return i;

			}
		}
		return -1;

	}
}
