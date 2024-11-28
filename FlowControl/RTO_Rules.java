package com.tka.conditionalstatements;

public class RTO_Rules {

	void validateLic(int age) {

		if (age < 0) {
			System.out.println("Invalid Age..It can not Be Negative");
		} else if(age==0){
			System.out.println("Invalid Age..It can not zero");
		}
		else if (age >= 18 && age <= 75) {
			System.out.println(" You are Eligible for Licence...");
		} else if (age < 18) {
			System.out.println("You are not eligible..you are underage");

		} else if(age >75 && age <100){
			System.out.println("You are not eligible..you are too old");
		}else {
			System.out.println("Age Range is high");
		}
	}

}
