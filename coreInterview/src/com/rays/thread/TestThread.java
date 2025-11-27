package com.rays.thread;

public class TestThread extends Thread {

	private String name;

	public TestThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + name);

		}
	}

	public static void main(String[] args) {

		TestThread t1 = new TestThread("kapil");
		TestThread t2 = new TestThread("paras");

		t1.start();
		t2.start();

	}

}
//Thread class extend karke run() me logic likhte hain aur start() se dono thread ek saath chalate hain.” ✅
//“Thread use karte hain jab class ko directly thread banana ho aur simple, single-use task execute karna ho.”