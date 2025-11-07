package com.collection.comparater;

import java.util.Comparator;

public class EmployeeShortByIdNameSalary implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		int id = Integer.compare(o1.getId(), o2.getId());
		
		if (id == 0 && o1.getName().compareTo(o2.getName()) == 0) {
			return Double.compare(o1.getSalary(), o2.getSalary());
		}
		if (id == 0) {
			return o1.getName().compareTo(o2.getName());
		}
		return id;

	}
}
