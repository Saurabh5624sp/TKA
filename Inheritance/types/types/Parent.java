package com.tka.inheritance.types;

// single /simple inheritance

public class Parent {
	int cash=99999;
	
	void land() {
		System.out.println("Parents Land");
	}
	
	void car() {
		System.out.println("Parent car");
	}
	

}

class Child extends Parent{
	
	void Degree() {
		System.out.println("Child Degree");
	}
}
