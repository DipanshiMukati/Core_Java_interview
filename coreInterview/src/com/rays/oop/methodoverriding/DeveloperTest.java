package com.rays.oop.methodoverriding;


public class DeveloperTest {

	public static void main(String[] args) {
 
		Developer d = new FrontendDeveloper();
		Developer c = new BackendDeveloper();

		d.develop();
		c.develop();
	}

}
