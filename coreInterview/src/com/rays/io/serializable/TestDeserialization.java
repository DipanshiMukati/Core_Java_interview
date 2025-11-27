package com.rays.io.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\AA\\Pictures\\IO\\serializable.txt"));

		Marksheet mark = (Marksheet) in.readObject();
		System.out.println(mark.name);
		System.out.println(mark.physics);
		System.out.println(mark.chemistry);
		System.out.println(mark.maths);
		System.out.println(mark.total);
		in.close();
		System.out.println("success");
	}

}
