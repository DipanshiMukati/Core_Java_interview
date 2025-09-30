package com.rays.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lokesh solanki this is expert class its class encapsulation
 */
public class Person {

	private String name;
	private Date dob;
	private String address;
	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;

	}

	public void setAddress(String address) {
		this.address = address;

	}

	public Date getDob() {
		return dob;

	}

	public void setDob(Date dob) {
		this.dob = dob;

	}

}
