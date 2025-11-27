package com.rays.thread;

public class TestDaemonThread {

	public static void main(String[] args) {

		BackgroundThread t1 = new BackgroundThread("daemon thread");
		
		
   //daemon thread background  thread hota hai jo main thread ke saat chalta h daemon thread ko show karne ke liye hamne setdaemon to true kiya hai
		t1.setDaemon(true);
//
		t1.start();

		for (int i = 1; i <= 5; i++) {

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(i + " main");
		}
	}

}
