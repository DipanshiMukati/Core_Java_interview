package com.rays.exception;

public class TestUnchecked {

	public static void main(String[] args) {
		try {
			customer();
		} catch (UncheckedException e) {
			System.out.println(e);

		}
	}

	public static void customer() {
		employee();

	}

	public static void employee() {
		makepayment();

	}

	public static void makepayment() {
		throw new UncheckedException("unchecked exception called");

	}
}
