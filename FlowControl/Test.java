package com.tka.conditionalstatements;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logical l1 = new Logical();
		l1.compareTwo(20, 20);
		System.out.println("-------------------------------");
		
		int max=l1.compareThree(103, 0, 10);
		System.out.println("The MaXimum number is:"+max);
		System.out.println("-------------------------------");

		l1.evenoddcheck(0);
		System.out.println("-------------------------------");

		
		RTO_Rules r1=new RTO_Rules();
		r1.validateLic(1000);
		System.out.println("-------------------------------");


	}

}
