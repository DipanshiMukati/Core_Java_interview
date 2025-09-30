package com.rays.oop.ConstructorOverLoadings;

public class ConstructorOverLoadings {

	private int num;
	private String name;
	private String add;

	public ConstructorOverLoadings() {
		System.out.println("default constructor");
	}

	public ConstructorOverLoadings(int num) {
		this.num = num;
		System.out.println(num);
	}

	public ConstructorOverLoadings(int num, String name) {
		this.num = num;
		this.name = name;
		System.out.println(num);
		System.out.println(name);
	}

	public ConstructorOverLoadings(String name, String add) {

		this.add = add;
		this.name = name;
		System.out.println(name);
		System.out.println(add);

	}
	
	public static void main(String[] args) {
		
		ConstructorOverLoadings c = new ConstructorOverLoadings();
		
		ConstructorOverLoadings c1 = new ConstructorOverLoadings(1);
		
		ConstructorOverLoadings c2 = new ConstructorOverLoadings(2, "DG");
		
		ConstructorOverLoadings c3 = new ConstructorOverLoadings("DG", "kota");
//	Ek hi class ke andar alag-alag tarike ke constructors banaye ja sakte hain, aur
//		JVM constructor call karte waqt automatically decide karta hai kaunsa constructor use hoga,
//		based on arguments.	
		
	}
//	Kaise pata chalega kaunsa constructor call hoga?
//			👉 Ye JVM automatically decide karta hai arguments ke type aur number ke basis par.
}