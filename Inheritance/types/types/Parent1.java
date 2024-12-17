package com.tka.inheritance.types;

//hierarchical inheritance
public class Parent1 {
	
	void m1() {
		System.out.println("Parent m1()");
	}
	
}

class Child1 extends Parent1{
	void m2() {
		System.out.println("Child -1 m1()");
	}
}
class Child2 extends Parent1{
	void m3() {
		System.out.println("Child -2 m3()");
	}
}


