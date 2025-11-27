
package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteFromKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		FileWriter out= new FileWriter("C:\\Users\\AA\\Pictures\\hii.txt",true);

		System.out.println("enter here.....");

		String line = in.readLine();

		while (line != null) {
			out.write(line);

			System.out.println(line);
			line = in.readLine();

		}
		in.close();
		out.close();
		System.out.println("data add");
	}

}
