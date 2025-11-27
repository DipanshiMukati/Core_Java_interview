

package com.rays.thread;

public class TestJoinWithThread {

	public static void main(String[] args) {

		JoinThread t1 = new JoinThread("abc");

		JoinThread t2 = new JoinThread("xyz");
//join tread kya karta h 
		t1.start(); // Start t1 first

		

			try {
				t1.join();          // Wait for t1 to complete
			} catch (InterruptedException e) {
				e.printStackTrace();
			}                              
		
			t2.start(); // Start t2 after t1 completes
//		t2.interrupt();
	}

}
//“join() ek thread ko complete hone tak dusre thread ko wait karwata hai, isse execution sequence control hota hai.” ✅