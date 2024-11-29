package com.tka.iterativestatements;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Table t1 = new Table();
		System.out.println("Enter the number of which you want to print table");
		int no=sc.nextInt();
		t1.tableOf(no);
		System.out.println("----------------------");
		
		
		Even e1 = new Even();
		System.out.println("Enter Range From :");
		int start=sc.nextInt();
		System.out.println("To:");
		int end=sc.nextInt();
		
		e1.evenofRange(start,end);
		
		sc.close();

	}

}
