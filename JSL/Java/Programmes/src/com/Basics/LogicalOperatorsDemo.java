package com.Basics;

import java.util.Scanner;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		
		boolean isRaining=false;
		
		if(!isRaining) {
			System.out.println("Stay Home");
		}
		else {
			System.out.println("Go Out,Chill Out");
		}
	}

	 static void andOrOperatorDemo() {
		// voting application
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to US elections !!");
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		System.out.println("Please enter your pincode");
		int pincode = sc.nextInt();

		// if age > 18 and he should be US citizen to vote

		boolean ageComparison = age > 18;
		boolean areaMatch = pincode == 33;

		if (!(ageComparison && areaMatch)) {
			System.out.println("Please vote Trump mama !!");
		} else {
			System.out.println("Hey , you are not allowed to vote");
		}
		System.out.println("Your age is " + age);
		System.out.println("Your country pincode is is " + pincode);
	}

}
