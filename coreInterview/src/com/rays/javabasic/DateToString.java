package com.rays.javabasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf =  new SimpleDateFormat("dd-MM-yyyy");
		String strDate = sdf.format(date);
		System.out.println(strDate);
	}

}
