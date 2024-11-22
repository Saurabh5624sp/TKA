package com.tka.objexamples;

public class Tower {
	String cname="jio";
	int in_cost;
	String type;
	int height;
	String loc;
	
	
	String getDetails() {
		
	String cname="Jio";
		return "Name:"+cname;
	}
	
	void activate(int key) {
		
		System.out.println("Status:Active");
	}
	
	void deActivate(int key ) {
		
		System.out.println("Status:DeActive");
	}
	
	void maintainance() {
		System.out.println("Safety check");
	}
	
	

}
