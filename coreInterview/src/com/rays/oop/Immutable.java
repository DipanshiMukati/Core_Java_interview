
package com.rays.oop;

public final class Immutable {
	
	private final String name;
	
	//Java mein jab aap kisi class mein final field (jaise private final String name) declare karte ho,
//	to us field ko constructor ke through initialize karna padta hai — warna compile-time error aayega.
	
	
	
	public Immutable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	

}
