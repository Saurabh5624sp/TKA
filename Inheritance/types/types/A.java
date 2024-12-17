package com.tka.inheritance.types;

// Hybrid Inheritance
public class A {
	
void m1() {
	System.out.println("M1()");
}
}
class B extends A{
	void m2() {
	System.out.println("m2()");
	}
}
class C1 extends A{
	void m3() {
		System.out.println("m3()");
	}
}

class D extends B{
	void m4() {
		System.out.println("m4()");
	}
}
