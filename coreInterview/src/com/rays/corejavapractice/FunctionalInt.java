package com.rays.corejavapractice;

@FunctionalInterface
public interface FunctionalInt {

	public int operation(int a, int b);

	public static void sub(int a, int b) {
		System.out.println("sub" + (a - b));

	}

	public default void multi(int a, int b) {
		System.out.println("multi:" + (a * b));

	}

}
