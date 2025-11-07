
package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		v.add(1);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		

		Enumeration<Integer> e = v.elements();

		v.add(100);
		v.remove(2);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}
//enumeration ke saath Vector me modification karne par exception nahi aata —
//Fail-Safe (Vector + Enumeration) → change karoge to error nahi, bas old data dikhata hai ✅
//ye Fail-Safe behavior dikhata hai, jabki ArrayList + Iterator me Fail-Fast hota hai.
