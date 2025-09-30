package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	public static void main(String[] args) {
//		current date 
		LocalDate date = LocalDate.now();
//		dob
		LocalDate dob = LocalDate.of(2005, 06, 02);
//		period between
		Period p = Period.between(dob,date);
		System.out.println(p.getYears());
		
	}

}
