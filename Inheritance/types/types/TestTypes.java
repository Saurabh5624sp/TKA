package com.tka.inheritance.types;

public class TestTypes {
	
	public static void main(String[] args) {
		
		
		// single inheritance 
		Child child1 = new Child();
		System.out.println(child1.cash);
		child1.land();
		child1.car();
		child1.Degree();
		
		System.out.println("------------");
		
		// hierarchical inheritance
		Child1 jay =new Child1();
		jay.m1();
		jay.m2();
		
		Child2 viru =new Child2();
		viru.m1();
		viru.m3();
		
		System.out.println("------------");
		
		//multi-level inheritance 
		
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();
		
		//Multiple inheritance
		
		//C11 c=new C11();
		//c.m3();
		
		System.out.println("------------");
		
		//hybrid inheritance
		D d1=new D();
		d1.m1();
		d1.m2();
		d1.m4();
		
		
		//cyclic inheritance
//		Dog d=new Dog();
//		d.m1();
//		d.m2();
		
		
		
		
	}

}
