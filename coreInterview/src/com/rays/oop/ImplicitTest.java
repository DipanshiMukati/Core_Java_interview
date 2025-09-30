
package com.rays.oop;
//Object creation ke time pehle parent constructor run hota hai, phir child ka.
public class ImplicitTest extends Implicit{
	
	public ImplicitTest() {
//		System.out.println("child class");
		
	}
	
	public static void main(String[] args) {
		
		ImplicitTest f = new ImplicitTest();
	}

}
