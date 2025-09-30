
package com.rays.oop.shellowcloning;

public class ShellowClonig implements Cloneable {

	public int balance;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
