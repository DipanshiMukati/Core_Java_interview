package com.rays.corejavapractice;

public class NoteCount {
	public static void main(String[] args) {
		int[] notes = { 2000,500,200,100,30,20,10};
		int count = 0;
		int money = 4500;
		for (int i = 0; i < notes.length; i++) {

			count = money / notes[i];
			if (count > 0) {
				System.out.println(notes[i] + "= " + count);

			}
			money = money % notes[i];

		}

	}

}
