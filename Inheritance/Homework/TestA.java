package com.tka.inheritance.homework;

public class TestA {
public static void main(String[] args) {
	
	A obj1=new A();
	System.out.println(obj1.a);//10
	obj1.m1();//111
	
	
	System.out.println("-----------");
	
	B obj2=new B();
	System.out.println(obj2.a);//TKA
	obj2.m1();//222
	
	System.out.println("-----------");
	
	A obj3=new B();
	System.out.println(obj3.a);//10
	obj3.m1();//222
	
	System.out.println("-----------");
	
	//B obj4=new A();
	//System.out.println(obj4.a);//10
	//obj4.m1();//222
	
	
	System.out.println("-----------");
	
	A a1=new A();
	A b1=new B();
	
	a1=b1;
	
	System.out.println(a1.a);//10
	a1.m1();//222
	
	
}
}
