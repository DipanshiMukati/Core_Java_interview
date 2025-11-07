package com.collection.comparable;

public class test1 implements Comparable<test1> {

	private int id;
	private String name;
	private int salary;

	public test1(int id, String name, int salary) {
		this.id = id;
		this.name = name;
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

//	public int compareTo(test1 o) {
//		if (this.id == o.getId()) {
////			return o.getName().compareTo(this.name);
//			return this.name.compareTo(o.getName());
//		}
//		return id;
//	
//	}

	public int compareTo(test1 o) {
		if (this.id == o.getId()) {
			return this.name.compareTo(o.getName());
		}
		return this.id - o.id;
	}
	
	/*
	 * public int compareTo(test1 obj) { if (this.id > obj.getId()) { return 1; }
	 * else if (this.id < obj.getId()) { return -1; } else {
	 * 
	 * return this.name.compareTo(obj.getName()); } }
	 */

	@Override
	public String toString() {
		return id + " " + name;
	}

}
