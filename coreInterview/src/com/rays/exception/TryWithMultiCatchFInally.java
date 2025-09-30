
package com.rays.exception;

public class TryWithMultiCatchFInally {
	/**
	 * in this class sir ask many cross question 
	 * like how we stop the execution of catch block and finally block
	 * some tricky question ok
	 */
	public static void main(String[] args) {
		int a=5;
		String s = null;
		try {
			System.out.println(a/0);
//			 System.exit(0);
			System.out.println("tryblock"+s.length());
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException"+e);
			 System.exit(0);

		} catch (NullPointerException e) {
			System.out.println("NullPointerException"+e);
//			 System.exit(0);
		}finally {
			System.out.println("finalyblock okok");
		}
	
	}
}