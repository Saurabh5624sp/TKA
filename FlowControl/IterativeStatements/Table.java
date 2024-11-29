package com.tka.iterativestatements;

public class Table {

	void tableOf(int no) {

		System.out.println("------");
		for (int i = 1; i <= 10; i++) {

			System.out.println(no + "*" + i + "=" + (no * i));
		}

	}

}
