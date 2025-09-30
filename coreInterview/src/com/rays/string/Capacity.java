package com.rays.string;

public class Capacity {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("riya");

		System.out.println("length1111:" + sb.length());// 4

		System.out.println("capacity1111:" + sb.capacity());// 20

		sb.append("abcdefghijklmnopduuu");//20
		System.out.println(" abcdefghijklmnopduuu first app 20 + 4 = 24 ");
		System.out.println("after append length:" + sb.length());// 24
     //(old capasity *2)+2 = 20 *2+2 = 42 ;
		System.out.println("after append capacity" + sb.capacity());// 42

		sb.append("a");
		System.out.println("after append a");//24+1
		System.out.println("after append a length:" + sb.length());// 25(l<c)cap++

		System.out.println("after append a capacity:" + sb.capacity());// 42
//		Capacity tabhi badhegi jab new length > current capacity ho jaaye.


		sb.append("gggggggggggggggggggggg");//22
		System.out.println("apppppppend secomd");
		System.out.println("last length:" + sb.length());//25+22 = 47

		System.out.println("last capacity:" + sb.capacity());//42+1*2=86

//		👉 **Capacity tabhi badegi jab naya data add karne se `length > current capacity` ho jaaye.**

		

		
	}
}
