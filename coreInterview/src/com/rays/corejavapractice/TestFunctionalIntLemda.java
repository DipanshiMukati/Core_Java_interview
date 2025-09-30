package com.rays.corejavapractice;

public class TestFunctionalIntLemda {
	public static void main(String[] args) {
		
		FunctionalInt f = (a, b) -> {
			return a * b;
		};
		int a = 10;
		int b = 5;
		System.out.println("opreation" + f.operation(a, b));
		f.multi(a, b);
		FunctionalInt.sub(a, b);
	}
}
