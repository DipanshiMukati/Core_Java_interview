
package com.collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpIdTest {
	public static void main(String[] args) {

		List<Emp> l = new ArrayList();
		l.add(new Emp(1, "lokesh"));
		l.add(new Emp(4, "nikhil"));
		l.add(new Emp(3, "deepak"));
		l.add(new Emp(2, "dogesh"));

		l.stream().sorted(Comparator.comparingInt(Emp::getId))
				.forEach(e -> System.out.println(e.getId() + " =" + e.getName()));

	}

}
