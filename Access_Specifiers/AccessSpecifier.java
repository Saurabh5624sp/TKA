package com.tka.batch.practice;

public class AccessSpecifier {

	
	
	private int balance=100000;
	
	private AccessSpecifier() {
		System.out.println("constuctor as private");
	}
	
	int  m1() {
		
		
		return balance;
	}

	
	private int m2() {
		
		return 10;
	}
	
    static AccessSpecifier m3() {
	   
	   AccessSpecifier as=new AccessSpecifier();
	   as.m2();
	   return as;
	   
   }
   
	
	
	
}
