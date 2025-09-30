package com.rays.string;

import java.util.Arrays;

public class StringObj {
	
	public static void main(String[] args) {
		
	String s1 = "SUNILOS";
	String s2 =new String("SUNILOS");
	String s3 = "SUNILOS";
	String s4 =new String("SUNILOS");
//	name.toLowerCase();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1=s2);
	System.out.println(s1=s3);
	System.out.println(s2=s3);
	System.out.println(s2==s4);
	System.out.println(s2.equals(s4));
	System.out.println(s1.equals(s2));

	}

}