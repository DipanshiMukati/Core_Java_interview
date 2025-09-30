
package com.rays.oop.Interface;

/**
 * @author lokesh solanki
 * 
 * we holds the child class object into parent class
 * but we can't call the methods of each other
 * remove the comment line no 26 and see what happens ok...
 */
public class InterfaceTest implements Interfacee,Interface2{

	@Override
	public int sum(int a, int b) {
		return a + b;
	}
	
	@Override
	public int sum(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {

		Interfacee b = new InterfaceTest();
		System.out.println(b.sum(10, 20));
//		System.out.println(b.sum(11, 22, 33));
		System.out.println("--------------"+Interfacee.a);
		Interface2 bb = new InterfaceTest();
		System.out.println(bb.sum(1, 2, 4));
	
		
	}
}

