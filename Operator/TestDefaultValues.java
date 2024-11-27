package com.tka.op;

public class TestDefaultValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
	 DefaultValues d1 = new DefaultValues();
	 
	 System.out.println(d1.b);//0
	 System.out.println(d1.s);//0
	 System.out.println(d1.i);//0
	 System.out.println(d1.l);//0
	 System.out.println(d1.f);//0.0
	 System.out.println(d1.d);//0.0
	 System.out.println(d1.o);//false
	 System.out.println(d1.ch);//blank space
	 
	 System.out.println(d1.s1);// null (non primitive )
	 
	 d1.m1();
 	}

}
