package com.rays.oop;

public class ImmutableTest  {
	
	public static void main(String[] args) {
		
		//jab hum object bnate hai to constructor call hota hai this.name = "riya"	
		
		Immutable t = new Immutable("Riya");
		System.out.println(t.getName());
		
	}

}