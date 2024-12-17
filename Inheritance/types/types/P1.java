package com.tka.inheritance.types;


// Multiple Inheritance
public class P1 {
	
	void m1() {
		System.out.println("Parent 1- m1()");
	}

}

class P2{
	void m2() {
		System.out.println("Parent 2- m2()");
	}
}

class C11 extends P1,P2{
	void m3() {
		System.out.println("C11 -m3()");
	}
}
