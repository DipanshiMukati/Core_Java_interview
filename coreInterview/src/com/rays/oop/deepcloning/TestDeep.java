
package com.rays.oop.deepcloning;

/**
 * @author lokesh solanki
 * in this class sir first remove the c.cone method and then remove
 * Costumer class's no.clone() and ask the output 
 * so be prepare for it OK
 */
public class TestDeep {
	public static void main(String[] args) throws CloneNotSupportedException  {

		Costumer c = new Costumer("Dipanshi");
		Costumer c1 = (Costumer)c.clone();
		c1.name = "Bharti";
		c1.no.balance = 200;

		System.out.println(c.name);
		System.out.println(c.no.balance);

		System.out.println(c1.name);
		System.out.println(c1.no.balance);

	}

}
