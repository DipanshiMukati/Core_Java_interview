
package com.rays.oop.ConstructorCalling;

/**
 * @author lokesh solanki
 * in this class sir remove the super keyword and ask what happen or what will be the output
 * so it gives a compilation error 
 * if parent class does  not have default constructor then we must need to call atleast one 
 * Parameterized constructor.
 * so in this case we simply define the default constructor in parent class
 */
public class TestConstructorCalling extends ConstructorCalling {

	public TestConstructorCalling(String fName, String lName, String Address) {
		super(fName, lName, Address);
	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling("lokesh", "solanki", "betul");
	}

}
