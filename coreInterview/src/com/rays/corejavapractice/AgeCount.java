package com.rays.corejavapractice;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate dob = LocalDate.of(2005, 06, 02);
		Period p = Period.between(dob, date);
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());


	}
	
}
