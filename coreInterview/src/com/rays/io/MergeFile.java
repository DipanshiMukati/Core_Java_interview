	
	package com.rays.io;
	
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	
	public class MergeFile {
	
		public static void main(String[] args) throws IOException {
	
			FileWriter out = new FileWriter("C:\\Users\\AA\\Pictures\\IO\\practice.txt");
	
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\AA\\Pictures\\IO\\example.txt"));
	
			String line = in.readLine();
	
			while (line != null) {
	
				out.write(line);
	
				line= in.readLine();
	
			}
			in.close();
	
			in= new BufferedReader(new FileReader("C:\\Users\\AA\\Pictures\\IO\\hii.txt"));
	
			String line2 = in.readLine();
	
			while (line2 != null) {
	
				out.write(line2);
	
				line2 = in.readLine();
	
			}
			in.close();
			out.close();
	
			System.out.println("success.......");
	
		}
	
	}
