package com.tka.iterativestatements;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();

		System.out.println("-----Calculator Menu-----");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");

		System.out.println("Enter 1st Number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number:");

		int b = sc.nextInt();

		System.out.println("Enter Your Choice...");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			// Calculator c1 = new Calculator();
			System.out.println("You Chosen For Addition Operation");
			c1.addTwo(a, b);
			break;
		case 2:

			System.out.println("You Chosen For Substraction Operation");
			c1.subTwo(a, b);
			break;
		case 3:

			System.out.println("You Chosen For Multiplication Operation");
			c1.mulTwo(a, b);
			break;
		case 4:

			System.out.println("You Chosen For Division Operation");
			c1.divTwo(a, b);
			break;
		case 5:

			System.out.println("You Chosen For Modulus Operation");
			c1.modTwo(a, b);
			break;
		default:
			System.out.println("Invalid Choice !!!");

		}

		sc.close();

	}

}
