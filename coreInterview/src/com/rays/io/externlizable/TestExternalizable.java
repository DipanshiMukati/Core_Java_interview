package com.rays.io.externlizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {
	public static void main(String[] args) throws Exception {
		// Serialization
		Employee emp = new Employee();
		emp.id = 1;
		emp.name = "john";
		emp.salary = 50000;

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AA\\Pictures\\hii.txt"));
		out.writeObject(emp);
		out.close();
		System.out.println("success");

		// Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\AA\\Pictures\\hii.txt"));
		Employee emp2 = (Employee) in.readObject();
		System.out.println("ID: " + emp2.id);
		System.out.println("Name: " + emp2.name);
		System.out.println("Salary: " + emp2.salary);
		in.close();
	}
}
