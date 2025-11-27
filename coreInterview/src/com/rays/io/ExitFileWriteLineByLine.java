package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileWriteLineByLine {

	public static void main(String[] args) throws IOException  {

		FileWriter file = new FileWriter("C:\\Users\\AA\\Pictures\\IO\\example.txt", true);

		PrintWriter out = new PrintWriter(file);

		out.println("hello bhai");
		System.out.println("hello bhai");

		out.println("kkrh??");
		System.out.println("kkrh??");

		out.close();

		
		file.close();

		System.out.println("data write successfully...!!!");

	}

}
