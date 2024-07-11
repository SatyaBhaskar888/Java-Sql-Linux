package com.Basics.Examples;

import java.util.Scanner;

public class SumOfDigits {
		public static void main(String[] args) {
//			While_sum();
//			For_sum();
			Scanner sc = new Scanner(System.in);
			int num= sc.nextInt();
			System.out.println(num%9==0? 9: num%9 );
			//For sum(sum(sum(....)digits) Final Sum.
		}

		private static void For_sum() {
			Scanner sc = new Scanner(System.in);
			int num= sc.nextInt();
			int sum = 0;
			for(;num>0;num = num/10) {
				sum = sum+ num%10;
				
			}
			System.out.println(sum);
		}

		private static void While_sum() {
			Scanner sc = new Scanner(System.in);
			int num= sc.nextInt();
			int sum = 0;
			while (num>0) {
				sum = sum+ num%10;
				num = num/10;
				
			}
			System.out.println(sum);
		}
}
