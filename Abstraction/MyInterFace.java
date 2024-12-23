package com.tka.abstractclass;

public interface MyInterFace {
	
	void m1();
	void m2();
	
	
	default void defaultMethod(){
		
		System.out.println("Default method");
		
	}
	
	public static void staticMethod() {
		System.out.println("Static method");
	}

}

abstract class Abs implements MyInterFace{
	
	public abstract void m3();
	
	@Override
	public void m2() {
		System.out.println("M2() method overridden in Abstact class");
	}
	
	public void disp() {
		System.out.println("Abstarct class have concrete methods");
	}
	
}

class Demo extends Abs{
	
	@Override
	public void m1() {
		System.out.println("M1() overriden in Demo class");
	}
	
	@Override
	public  void m3() {
			System.out.println("m3() ovverriden in Demo class");
	}
	
}
