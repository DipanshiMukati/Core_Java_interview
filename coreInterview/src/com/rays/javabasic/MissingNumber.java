package com.rays.javabasic;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] a = {1,3,4};
		int[] b = {1,3,0,4,8};
		
		for(int i=0; i<b.length; i++) {
			boolean flag = false;
			
			for(int j=0; j<a.length; j++) {
				if(a[j]==b[i]) {
					 flag = true;
					 
					 break;
				}
			}
			if(!flag) {
				System.out.println(b[i]);
			}
		}
		
	}

}
	
//		