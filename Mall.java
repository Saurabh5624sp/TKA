package com.tka.objexamples;

public class Mall {

	String name;
	String loc;
	int no_store;
	String op_hr;
	int park_cap;

	String getDetails() {

		name = "Dmart";

		return name;
	}

	void openMall() {

		System.out.println("opened..");

	}

	void closeMall() {

		System.out.println("closed..");

	}

	void addStore() {

		System.out.println("new store added");

	}

	void removeStore() {

		System.out.println("new store added");

	}
	
	int parkAvailability()
	{
		return park_cap;
	}
}
