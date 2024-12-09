package com.tka.batch.calculator;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calculator c1 = new Calculator();
		// System.out.println(c1.addTwo(10,20));
		System.out.println("Welcome to calculator");
		System.out.println("Enter Your password--->");
		Scanner sc = new Scanner(System.in);
		int userpass = sc.nextInt();
		Calculator.access(userpass);
	}

}
