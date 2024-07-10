package com.Basics;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		//Switch Case is used when we have number of options
//		Switch_num();
//		Switch_char();
		
		
	}

	private static void Switch_char() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your name");
		int ch = sc.next().charAt(0);
		switch(ch) {
		case 'A':{
			System.out.println("Your name starts with A");
			break;
		}
		case 'K':{
			System.out.println("Your name starts with K");
			break;
		}
		case 'P':{
			System.out.println("Your name starts with P");
			break;
		}
		default:{
			System.out.println("Get a good name");
			break;
		}
		}
	}

	private static void Switch_num() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Gear do you like for Luffy?");
		int num = sc.nextInt();
		switch(num) {
		case 1:{
			System.out.println("Gomu Gomu no...Gear 1");
		}
		case 2:{
			System.out.println("Gomu Gomu no...Gear 2");
		}
		case 5:{
			System.out.println("Joyboy Enters & Drums of Liberation begins");
		}
		default:{
			System.out.println("Luffy hasnt reached that level yet");
		}
		}
	}

}
