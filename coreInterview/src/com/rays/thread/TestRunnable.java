package com.rays.thread;

public class TestRunnable implements Runnable {

	public String name;

	public TestRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 2; i++) {

			System.out .println(i + "  " + name);
		}
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new TestRunnable("Ram"));
		Thread t2 = new Thread(new TestRunnable("Shyam"));

		t1.start();
		t2.start();

	}
}
//“Runnable me hum logic run() me dete hain aur Thread class se start() call karke thread ko parallel run karwate hain.”
//“Runnable use karte hain kyunki ye flexible hai, multiple inheritance allow karta hai,
//aur same task ko multiple threads me reuse kar sakte hain.”