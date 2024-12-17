package com.tka.inheritance.types;

//Multilevel Inheritance
public class GP {
	
	void m1() {
		System.out.println("GP-M1()");
	}

}
class P extends GP{
   void m2() {
	   System.out.println("P-m2()");
   }
}

class C extends P{
	
	void m3() {
		System.out.println("C-m3()");
	}
}
