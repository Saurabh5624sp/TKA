package com.tka.batch.calculator;

import java.util.Scanner;

class Calculator {
	


	private Calculator() {
		// System.out.println("constructor");
	}

	private int addTwo(int n1, int n2) {

		return n1 + n2;
	}

	private int subTwo(int n1, int n2) {

		return n1 - n2;
	}

	private int div(int n1, int n2) {

		return n1 / n2;
	}

	private int mulTwo(int n1, int n2) {

		return n1 * n2;
	}

	private int mod(int n1, int n2) {

		return n1 % n2;
	}

	static void access(int pass) {
		
		Calculator c1 = new Calculator();
		
		if (pass == 1234) {

			System.out.println("User Verified...!!!");
			do {
				System.out.println("----Menu Driven----");
				System.out.println("1.Addtion\n2.Substraction\3.Multiplication\n4.Divion\n5.Modulus");
				Scanner sc = new Scanner(System.in);
				System.out.println("enter your choice");
				int ch = sc.nextInt();
				System.out.println("Enter Your 1st Number");

				int n1 = sc.nextInt();
				System.out.println("Enter Your 2nd Number");

				int n2 = sc.nextInt();

				switch (ch) {

				case 1:
					System.out.println("Addition is:"+c1.addTwo(n1, n2));
					break;

				case 2:
					System.out.println("Substraction is:"+c1.subTwo(n1, n2));
					break;
				case 3:
					System.out.println("Multiplication is:"+c1.mulTwo(n1, n2));
					break;
				case 4:
					System.out.println("Division is:"+c1.div(n1, n2));
					break;
				case 5:
					System.out.println("Modulus is:"+c1.mod(n1, n2));
					break;

				default:
					System.out.println("invalid choice...");
					break;

				}
				System.out.println("do you want exit press 0");
				int next = sc.nextInt();
				if (next == 0) {
					break;
				}

			} while (true);

		} else {
			System.out.println("wrong password");
		}
		
	}

}
