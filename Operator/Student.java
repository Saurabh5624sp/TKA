package com.tka.op;

public class Student {
	
	
	void addressOfobj() {
		
		Student s1 = new Student();
		System.out.println(s1);
		
		Student s2;
		//System.out.println(s2);// local variable must be initialized
		s2=s1;
		System.out.println(s2);
		
		Student s3;
		//System.out.println(s3);// local variable must be initialized
		s3=new Student();
		System.out.println(s3);
		
		s3=s1;
		
	 System.out.println(s3);
		
		
	}

}
