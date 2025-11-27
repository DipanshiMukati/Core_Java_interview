
package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadLineByLineText {

	public static void main(String[] args) throws IOException {

		FileReader out = new FileReader("C:\\Users\\AA\\Pictures\\hii.txt");

		BufferedReader in = new BufferedReader(out);
		String line = in.readLine();

		while (line != null) {
			System.out.println(line);

			line = in.readLine();

		}
		out.close();
		in.close();

	}

}
