
package com.collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// salary >= 20000
public class TestEmployeeSalary {

	public static void main(String[] args) {

		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();
		list.add(new EmployeeSalary(25000, "nikhil"));

		list.add(new EmployeeSalary(20000, "lokesh"));
//		list.add(new EmployeeSalary(25000, "nikhil"));
		list.add(new EmployeeSalary(1000, "deepak"));
		list.add(new EmployeeSalary(5242, "amit"));
		list.add(new EmployeeSalary(60000, "nikhil"));

		list.stream().distinct().sorted(Comparator.comparingInt(EmployeeSalary::getSalary))
				.filter(c -> (c.getSalary() >= 2000))
				.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));
	}

}
