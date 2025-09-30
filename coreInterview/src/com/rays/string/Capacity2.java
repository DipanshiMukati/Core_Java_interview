package com.rays.string;

public class Capacity2 {
	public static void main(String[] args) {
		
	

	   StringBuffer sb = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
	   System.out.println("length11:"+sb.length());
	   System.out.println("capacity11:"+sb.capacity());
	   System.out.println(sb.append(""));
	   System.out.println("length2:"+sb.length());
	   System.out.println("capacity2:"+sb.capacity());
	   System.out.println(sb.append("mukati"));
	   System.out.println("length3:"+sb.length());
	   System.out.println("capacity3:"+sb.capacity());
	   System.out.println(sb.append("kedwaindore"));
	   System.out.println("length4:"+sb.length());
	   System.out.println("capacity4:"+sb.capacity());

}
}