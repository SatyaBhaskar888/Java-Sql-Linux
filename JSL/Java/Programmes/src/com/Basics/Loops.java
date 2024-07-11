package com.Basics;

public class Loops {
// Initialise the index, Test the condition, Update the Index
	public static void main(String[] args) {
//		1. While loop
//		2. Do while loop
//		3. for loop
//		4. for each loop (enhanced for loop in  Java)
		//while_Loop(); entry control loop, min iter =0
		//do_while_Loop(); exit control loop, min iter = 1
//		For_Loop();
		
	}


	private static void For_Loop() {
		for(int i=1;i<=9;i++) {
			System.out.println(i+"is a single digit number");
		}
	}


private static void do_while_Loop() {
	int c=0;
	do{
		System.out.println(c + "is a single digit number");
		c+=1;
	}while(c<=9);
	// First executes and then checks if the condition is true
}
		

private static void while_Loop() {
	int c=0;
	while(c<=9) {
		System.out.println(c + "is a single digit number");
		c+=1;
	}
}
}
