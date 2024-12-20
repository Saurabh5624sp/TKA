package com.tka.interfaces;

 interface A {
	
void m1();

}
 
 class Z{
	 
 }

 class B extends Object implements A{
	 
	 public void m1() {
		 System.out.println(111);
	 }
 }
 
 //  interface can extends one or more interfaces

 interface C extends A {
	 
 }
 
 
 
//  interface cant implements another interface
 
// interface D implements A{
//	 
// }
 

 // interface cant extends class
 
// interface E extends Z{
//	 
// }
 
 
 
 

 