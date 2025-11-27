package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\AA\\Pictures\\mega.jpeg";
		String target = "C:\\Users\\AA\\Pictures\\p2.jpeg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int i;
		while ((i = in.read()) != -1) {

			out.write(i);
		}
		in.close();
		out.close();

		System.out.println("success");
	}

}