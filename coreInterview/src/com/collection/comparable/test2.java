package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class test2 {
	public static void main(String[] args) {
	    List l = new ArrayList();
		l.add(new test1(1, "dev",2000));	
		l.add(new test1(1, "aaa", 200));
		l.add(new test1(3, "eeee", 4000));
		
		Collections.sort(l);
		System.out.println(l);
		
		
	}

}
