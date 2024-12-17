package com.tka.inheritance.types;

public class Animal extends Dog {
	
	void m1() {
		System.out.println(111);
	}

}
class Dog extends Animal{
	void m2() {
		System.out.println(222);
	}
}
