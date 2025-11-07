package com.rays.collection;

public class AutoBoxingUnboxing {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// AutoBoxing
		// primitive data is converted into Object, it is called Auto-boxing
		int a = 1;
		Integer b = a;

		System.out.println("Wrapper Int :" + b);

		// Unboxing
		// object data is converted into primitive type, it is called Auto-boxing
		Integer c = new Integer(15);
		int d = c;
		System.out.println(d);

	}
}            