package com.rays.exception;

public class test1 {
	public static void main(String[] args) {
		
	
	int a= 10;
	String name = null;
	 try {
		System.out.println(a/0);
		System.out.println(name.length());
		
	} catch (ArithmeticException |NullPointerException e) {
System.out.println(e);	}
}
}