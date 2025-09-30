

package com.rays.oop.shapeArrayWOC;

/**
 * @author lokesh solanki
 * 		   the class full name is Shape Array without constructor
 *         Instead of constructor we use getter and setter. in this class sir ask
 *         why we use type casting so the answer is we type caste the classes for
 *         accessing their attributes and methods
 */
    public class TestShape {

	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];
		c.setRadius(2.12);
		System.out.println("Circle"+s[0].area());

		Rectangle r = (Rectangle) s[1];
		r.setLength(10);
		r.setWidth(10);
		System.out.println("Rectangle"+s[1].area());

		double a = Area(s);
		System.out.println(a);

	}

	public static double Area(Shape[] s) {
		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}
		return totalArea;
	}
}
