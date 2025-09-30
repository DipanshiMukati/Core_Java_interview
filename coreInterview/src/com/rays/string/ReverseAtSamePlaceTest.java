package com.rays.string;

public class ReverseAtSamePlaceTest {
	public static void main(String[] args) {

		String name = "dipanshi mukati";
		String[] a = name.split(" ");
//		.split(" ") → string ko space " " ke base pe tod deta hai aur ek array me convert kar deta hai
//		a[0] = "dipanshi"
//		a[1] = "mukati"

		for (int i = 0; i < a.length; i++) {
//			First iteration: i = 0 → word = "dipanshi"
//			Second iteration: i = 1 → word = "mukati"
			for (int j = a[i].length() - 1; j >= 0; j--) {

				System.out.println(a[i].charAt(j));
			}

			System.out.println(" ");
//			Ye har word ke baad ek blank line print karta hai taaki dono words alag-alag dikhai den.
		}

	}
}

//🔹 First outer loop (i = 0, word = "dipanshi")
//    a[0] = "dipanshi" → length = 8
//  Inner loop: j = 7 se start hoga (last char i)

//🔹 Second outer loop (i = 1, word = "mukati")
//a[1] = "mukati" → length = 6
//Inner loop: j = 5 se start hoga (last char i)

//
//Deep logic samajh lo ek line me
//
//👉 Outer loop = words ko pick karta hai.
//👉 Inner loop = har word ko reverse me character by character print karta hai.
//👉 charAt(j) = ek ek character nikalta hai us word se.
//👉 j-- = reverse me chalne ka reason hai.