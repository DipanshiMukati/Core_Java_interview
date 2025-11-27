
package com.rays.thread;

import com.rays.thread.Racing;

public class TestRacing {

	public static void main(String[] args) {

		Racing t1 = new Racing("dipanshi");

		Racing t2 = new Racing("mukati");

		t1.start();
		t2.start();
	}
}
