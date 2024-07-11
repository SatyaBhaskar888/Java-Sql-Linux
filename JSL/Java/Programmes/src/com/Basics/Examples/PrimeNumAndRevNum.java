package com.Basics.Examples;

import java.util.Scanner;

public class PrimeNumAndRevNum {
	public static void main(String[] args) {
//		PrimeCase1();  //1 to n
//		PrimeCase2();  //2 to n (n-1 times)
//		PrimeCase3();  //2 to n-1 (n-2 times)
//		PrimeCase4();  //2 to n/2 (n/2 times)
//		PrimeCase5();  // ***** Optimal Code 2 to sqrt(n) (root(n) times)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int revNum = 0;
		while(num>0) {
			int rem= num%10;
			revNum= revNum*10+rem;
			num = num/10;	
		}
		System.out.println(revNum);
	}

	private static void PrimeCase5() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorCount = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				factorCount++;

			}
		}
		if (factorCount == 0) {
			System.out.println("prime");
		} else {
			System.out.println("Oops");
		}
	}

	private static void PrimeCase4() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorCount = 0;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				factorCount++;

			}
		}
		if (factorCount == 0) {
			System.out.println("prime");
		} else {
			System.out.println("Oops");
		}
	}

	private static void PrimeCase3() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorCount = 0;
		for (int i = 2; i <= num-1; i++) {
			if (num % i == 0) {
				factorCount++;

			}
		}
		if (factorCount == 0) {
			System.out.println("prime");
		} else {
			System.out.println("Oops");
		}
	}

	private static void PrimeCase2() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorCount = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				factorCount++;

			}
		}
		if (factorCount == 1) {
			System.out.println("prime");
		} else {
			System.out.println("Oops");
		}
	}

	private static void PrimeCase1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorCount = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factorCount++;

			}
		}
		if (factorCount == 2) {
			System.out.println("prime");
		} else {
			System.out.println("Oops");
		}
	}
}
