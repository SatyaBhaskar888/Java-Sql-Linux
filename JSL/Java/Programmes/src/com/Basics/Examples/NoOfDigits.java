package com.Basics.Examples;
import java.util.Scanner;

public class NoOfDigits {
	public static void main(String[] args) {
		While_example();
//		For_Example();
	}



	private static void For_Example() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if (num == 0) {
			System.out.println("Single Digit Number");
		}else {
		for(;num>0;num=num/10) {
			count++;
		}
		}
				
	System.out.println(count);
	}
				


	private static void While_example() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if (num == 0) {
			System.out.println("Single Digit Number");
		}else {
		while(num>0) {
			num= num/10;
			count++;
		}
		}
				
	System.out.println(count);
	}
}
