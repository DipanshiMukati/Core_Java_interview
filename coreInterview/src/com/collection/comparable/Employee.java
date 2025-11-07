package com.collection.comparable;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	// we use this method but sir says give with another type so try below method
	@Override
//	public int compareTo(Employee o) {
//		if (this.id > o.getId()) {
//			return 1;
//		} else if (this.id < o.getId()) {
//			return -1;
//		}else
//
//		return 0;
//	}@Override
	public int compareTo(Employee o) {
	    if (this.id > o.getId()) {
	        return 1; // current object id bada → aage
	    } else if (this.id < o.getId()) {
	        return -1; // current object id chhota → peeche
	    } else {
	        // id same → name se sorting
	        return this.name.compareTo(o.getName()); // alphabetical order
	    }
	}

//	@Override
//	public int compareTo(Employee obj) {
//		if (this.name.compareTo(obj.getName()) > 0) {
//
//			return 1;
//		}
//		if (this.name.compareTo(obj.getName()) < 0) {
//			return -1;
//		} else {
//			return obj.getSalary() - this.salary;
//		}
//	}

	@Override
	public String toString() {
		return id + " " + name + salary;
	}

}