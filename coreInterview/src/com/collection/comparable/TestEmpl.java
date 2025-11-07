
package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmpl {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new Employee(1, "dev",2000));
		l.add(new Employee(1, "ram",3000));
		l.add(new Employee(3, "amitshah",4999));
		l.add(new Employee(4, "amitpatel",4099));

		Collections.sort(l);

		System.out.println(l);
	}
}
