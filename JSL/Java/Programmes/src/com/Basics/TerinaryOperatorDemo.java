package com.Basics;

import java.util.Scanner;

public class TerinaryOperatorDemo {

	public static void main(String[] args) {
		//
		TernaryOpMethod();
	}

	private static void TernaryOpMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Masthan IT solutions coding interview");
		System.out.println("Enter first Number");
		int firstNumber = sc.nextInt();
		System.out.println("enter second number");
		int secondNumber = sc.nextInt();
		System.out.println("please enter third number");
		int thirdNumber = sc.nextInt();

		int highestNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;

		int theHighestNumber = (highestNumber > thirdNumber) ? highestNumber : thirdNumber;

		System.out.println(theHighestNumber + " peddadhi !!");

		int res = (firstNumber > secondNumber && firstNumber > thirdNumber) ? firstNumber
				: (secondNumber > thirdNumber) ? secondNumber : thirdNumber;

		System.out.println(res + " peddhadhi");
	}

}
