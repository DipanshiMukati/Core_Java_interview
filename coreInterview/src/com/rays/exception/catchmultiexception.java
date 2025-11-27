package com.rays.exception;

public class catchmultiexception  {
	public static void main(String[] args) {
		 int i = 10;
		 String name = null;
		 try {
			System.out.println(name.length());
			int j = i/0;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e);
			
			// TODO: handle exception
		}
	}

}
