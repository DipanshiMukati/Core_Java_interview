
package com.rays.oop.ShapeArrayWithConstructor;

public class TestShape {
	
	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		s[0] = new Circle(2.0);
		s[1] = new Rectangle(10, 10);
		
		System.out.println(s[0].area());
		System.out.println(s[1].area());
		
		double a = Area(s);
		System.out.println(a);
	}
	
	public static double Area(Shape[] s) {
		double totalArea = 0;
		
		for(int i=0; i<s.length; i++) {
			totalArea = totalArea + s[i].area();
		}
		
		return totalArea;
	}

}
