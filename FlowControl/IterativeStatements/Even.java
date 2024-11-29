package com.tka.iterativestatements;

public class Even {

	void evenofRange(int start, int end) {

		System.out.println("The Even numbers in range " + start + " to " + end);
		for (int i = start; i <= end; i++) {

			if (i % 2 == 0) {
				System.out.println(i);

			}

		}
	}

}
