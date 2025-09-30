package com.rays.string;

public class StringAllMethodsTEST {

	public static void main(String[] args) {

		String name = "dipanshi";
		String str = "mukati";
		
		System.out.println("string length:"+ name.length());
		System.out.println("charAt:"+ name.charAt(0));
		System.out.println("indexof:"+name.indexOf("a"));
		System.out.println("upperCase:"+ name.toUpperCase());
		System.out.println("lowerCase:"+name.toLowerCase());
		System.out.println("started with:"+ name.startsWith("d"));
		System.out.println("endwith :"+name.endsWith("d"));
		System.out.println("concate:"+name.concat(str));
		System.out.println("substring:"+name.substring(3));

		System.out.println("trim:"+ name.trim());
		System.out.println("" + name.lastIndexOf('i'));
		
		


	}
}
