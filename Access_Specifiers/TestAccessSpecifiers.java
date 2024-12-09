package com.tka.batch.practice;

public class TestAccessSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AccessSpecifier as=new AccessSpecifier();//can't create object
		// System.out.println(as.balance); //directly can't access
        
		//int bal=as.m1();// access using the method
		//System.out.println("balance from m1 method-"+bal);
		
		//System.out.println(as.m2());//directly can't access
		
		AccessSpecifier.m3();
		
		AccessSpecifier obj1=AccessSpecifier.m3();// Indirectly create the object
		
		
	
	}

}
