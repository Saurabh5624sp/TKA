package com.tka.op;

public class Operator {

	void ArithemeticOperator(int no1, int no2) {
		
		// addition
		int add = no1 + no2;
		System.out.println("Addition is:" + add);

		// Subtraction
		int sub = no1 - no2;
		System.out.println("Substraction is:" + sub);

		// Multiplication

		int mul = no1 * no2;
		System.out.println("Multipication is:" + mul);

		// division
		int div = no1 / no2;
		System.out.println("division is:" + div);

		// modulus

		int mod = no1 % no2;
		System.out.println("Modulus is:" + mod);

	}

	void logicalOperator(int age) {

		// Logical AND
		
		if (age > 18 && age == 18 && age < 30) {
			System.out.println("adult");
		} else {
			System.out.println("no idea");
		}

		// Logical AND

		if (age > 18 || age == 18) {
			System.out.println("Eligible for Voting");
		} else {
			System.out.println("not yet");
		}

		// logical NOT

		boolean a = false;

		boolean b = !(a);
		System.out.println("Negation of a:" + b);// true

	}
	
	void bitwiseOperator(int a,int b)
	{
		//----> {&,|,}  works on binary operation
		

        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
		
		
	}
	
	void relationalOperator(int a,int b) {
		
		//==> >,>=,<,<= etc
		
		int age=18;
		if(a>b) {
			System.out.println("a is greater");
		}else
		
		{
			System.out.println("b is greater");
		}
		
		if(age>=18) {
			System.out.println("Eligible for licence");
		}
		
		else {
			System.out.println("not eligible");
		}
		
		
	
	}
	
	void equalityOperator(int a,int b) {
		
		//-->  {==,!=}
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
	}

	void compositeAssigmentOperator() {

		int a = 10; // regular assignment operator
		a += 5;
		System.out.println("addition:" + a);// 15

		a -= 5;
		System.out.println("Substraction:" + a);// 10

		a *= 5;
		System.out.println("Multification:" + a);// 50

		a /= 2;

		System.out.println("Division:" + a);// 25

		a %= 5;
		System.out.println("modulus:" + a);// 0

	}
	
	void inc_dec() {
		
		int a=10;
		//a=a+1;
		System.out.println(a++);//10
		System.out.println(a--);//11
	}

}
