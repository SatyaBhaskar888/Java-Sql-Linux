package com.Basics;
import java.util.Scanner;

public class CondState {
	public static void main(String[] args) {
		// Selection, Iteration, transfer Statements
		//Selection - if, Nested if, if-else, if-else-if statements
		nested_if();
		if_else_if();

	}

	private static void if_else_if() {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		if (num>0) {
			System.out.println("positive");
		} else if (num<0) {
			System.out.println("negative");
		} else {
			System.out.println("Aryabhatta Zero");
		}
	}

	private static void nested_if() {
		Scanner sc = new Scanner(System.in);
		String Ticket= sc.next();
		String Drinks = sc.next();
		if (Ticket.equals("Yes")) {
			if (Drinks.equals("Yes")) {
				System.out.println("Ticket Price + Drinks Price");
			}
		}
	}

}
