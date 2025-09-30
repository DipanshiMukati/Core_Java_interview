package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PersonTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Person p = new Person();
		p.setName("dipanshi");
		p.setAddress("indore");
		p.setDob(sdf.parse("09-09-2004"));
		System.out.println(p.getAddress());
		System.out.println(p.getName());
		System.out.println(p.getDob());
	}
}
