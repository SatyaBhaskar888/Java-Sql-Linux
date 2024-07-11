package com.Basics;
import java.util.Scanner;

public class ContinueandBreak {
	public static void main(String[] args) {
//		While_Continue();
//		FOR_Continue();
		
		
	}

	private static void FOR_Continue() {
		for (int i =1;i<=10;i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}
	}

	private static void While_Continue() {
		System.out.println("Hi, The Program starts now.");
		Scanner sc = new Scanner(System.in);
		int c = 0;
		while(c<=10) {
			c++;
			if(c==7) {
				continue; //continue skips the iteration while break comes out of the loop
			
		}
		System.out.println(c);
	}
	}
}
