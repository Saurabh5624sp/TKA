package com.tka.conditionalstatements;

public class Logical {

	void compareTwo(int num1, int num2) {

		if (num1 > num2) {
			System.out.println(num1 + " is maximum");
		} else if (num2 > num1) {
			System.out.println(num2 + " is Maximum");
		} else {
			System.out.println("Both are the same");
		}
	}

	int compareThree(int num1, int num2, int num3) {


		if (num1 == num2 && num2 == num3) {
			return num1;
		} else if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
			
		} else {
			return num3;

		}

	}

	void evenoddcheck(int no) {
		if (no != 0) {

			if (no % 2 == 0) {
				System.out.println(no + "is even number");
			} else {
				System.out.println(no + "is not even");
			}

		} else {
			System.out.println("nor odd not even");
		}

	}

}
