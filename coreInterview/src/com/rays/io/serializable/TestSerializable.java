package com.rays.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
		Marksheet mark = new Marksheet();
		mark.name = "dipanshi";
		mark.physics = 90;
		mark.chemistry = 80;
		mark.maths = 86;
		mark.total = mark.physics + mark.chemistry + mark.maths;

		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\AA\\Pictures\\serializable.txt"));
		out.writeObject(mark);
		out.close();
		System.out.println("success");

// Deserialization

//		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\AA\\Pictures\\serializable.txt"));
//
//		Marksheet mark1 = (Marksheet) in.readObject();
//		System.out.println(mark1.name);
//		System.out.println(mark1.physics);
//		System.out.println(mark1.chemistry);
//		System.out.println(mark1.maths);
//		System.out.println(mark1.total);
//		in.close();
//		System.out.println("success");
	}
}
