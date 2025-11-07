package com.rays.exception;
/**
 * in this class sir ask if we don't use try catch so what happen 
 * you just say, we throws the Exception on main method
 */
public class TestException {
	public static void main(String[] args)  {
		try {
			customer();

		} catch (CheckedException e) {
			System.out.println(e);
		}
	}

	public static void customer() throws CheckedException {
		employee();

	}

	public static void employee() throws CheckedException {
		makepayment();
	}

	public static void makepayment() throws CheckedException {
		throw new CheckedException("custom checked called");
	}

}
