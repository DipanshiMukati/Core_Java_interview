
package com.rays.oop.ConstructorCalling;

public class ConstructorCalling {

	String fName;
	String lName;
	String address;

	public ConstructorCalling(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println(fName);
		System.out.println(lName);
	}

	public ConstructorCalling(String fName, String lName, String Address) {
		this(fName,lName);
		
		this.address = address;
		System.out.println(address);
	}
}
	//current class ke dusre constructor ko call kar raha hai
	//(constructor chaining) taki code reuse ho sake.
// this current object ko refer karta hai aur code reuse aur clarity ke liye use hota hai.