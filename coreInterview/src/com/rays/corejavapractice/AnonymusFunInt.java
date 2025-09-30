package com.rays.corejavapractice;

public class AnonymusFunInt {
	public static void main(String[] args) {
		FunctionalInt f = new FunctionalInt() {

			@Override
			public int operation(int a, int b) {
				return a * b;
			}
		};
		int a = 10;
		int b = 5;
		System.out.println(f.operation(a, b));
		FunctionalInt.sub(a, b);
		f.multi(a, b);

	}
}