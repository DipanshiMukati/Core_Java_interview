 package com.rays.collection;

import java.util.Stack;

public class StackHolding {
	public static void main(String[] args) {
		Stack s = new Stack();

		for (char i = 'a'; i <= 'z'; i++) {
			s.push(i);
		}
		Stack s1 = new Stack();
		while (!s.isEmpty()) {
			s1.push(s.pop());
		}
		System.out.println(s1);

		while (!s1.isEmpty()) {
			s.push(s1.pop());
		}
		System.out.println(s);
	}
}