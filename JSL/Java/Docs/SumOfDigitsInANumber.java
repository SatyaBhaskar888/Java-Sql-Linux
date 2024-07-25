package com.flowcontrols;

import java.util.Scanner;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ye number reverse lo kavalo cheppu !!");

		int number = sc.nextInt();


		int revNum = 0;

		while (number > 0) {
			int reminder = number % 10;
			revNum = revNum * 10 + reminder;
			number = number / 10;
			//
		}
		System.out.println(revNum);

	}

	void primeNumberCase5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number ivvu Bhayya !!!");
		int n = sc.nextInt(); // 7

		int factorsCount = 0;

		int loopCounter = 0;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			loopCounter++;

			if (n % i == 0) {
				factorsCount++;
			}

		}

		if (factorsCount == 0) {
			System.out.println("Nuv icchindhi Prime Number ye");
		} else {
			System.out.println("oooooops !!! Not a prime");
		}

		System.out.println("Nee Loop >>>> " + loopCounter + " :::sarlu thirigindhi !!!");
	}

	private static void sod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of digits ki no ivvu ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int loopCounter = 0;

		while (num > 0) {
			int reminder = num % 10;
			sum = sum + reminder;
			num = num / 10;
		}

		System.out.println("Loop code output  :" + sum);
		System.out.println("Loop " + loopCounter + "   sarlu thirigindhi");
		int sumOfDigits = temp % 9 == 0 ? 9 : temp % 9; // O(1)
		System.out.println("Upendra Nasa code o/p :" + sumOfDigits);
	}

}
