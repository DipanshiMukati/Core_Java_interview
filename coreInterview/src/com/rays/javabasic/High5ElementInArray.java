package com.rays.javabasic;

import java.util.Arrays;

public class High5ElementInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 43, 224, 66, 32, 323, 24, 35, 34, 3 };
		Arrays.sort(arr);
		for (int i = arr.length - 5; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
