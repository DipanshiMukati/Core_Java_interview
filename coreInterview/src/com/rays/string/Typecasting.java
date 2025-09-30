package com.rays.string;

//✅ Simple yaad rakhne wali line:
//int → String → String.valueOf() ya Integer.toString()
//String → int → Integer.parseInt() ya Integer.valueOf()
public class Typecasting {

	public static void main(String[] args) {

//	🔄 int → String
//
//	1️ .String.valueOf()

		int num = 100;
		String str = String.valueOf(num);
		System.out.println(str + 50); // "10050"

//	2️⃣ Integer.toString()

		int num1 = 100;
		String str1 = Integer.toString(num1);
		System.out.println(str1 + 50); // "10050"

//	===========================================================

//	🔄 String → int
//
//	1️⃣ Integer.parseInt()

		
		
		
		
		String str3 = "200";
		int num3 = Integer.parseInt(str3);
		System.out.println(num3 + 50); // 250

//	2️⃣ Integer.valueOf() (iska return Integer hota hai, lekin auto-unboxing se int ban jata hai)

		String str4 = "200";
		int num4 = Integer.valueOf(str4);
		System.out.println(num4 + 50); // 250

	}
}
