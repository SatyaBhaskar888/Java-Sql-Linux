package com.Basics;

import java.util.Scanner;

public class LogicalOp {
	public static void main(String[] args) {
		logicalTernaryOp();
	}

	private static void logicalTernaryOp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets make an anime name with number and a string");
		System.out.println("Type a number");
		int num = sc.nextInt();
		System.out.println("Type a string ");
		String s = sc.next();
		// For Comapring string use.equals method
		// Short Circcuit Operatoes: While Comparing always write the failur 1st for (&&) and passing first for (||) to decrease time complexity)
		if(num ==1 && s.equals("Piece")) {
			System.out.println(" Gomu Gomu no... You are a OnePiece fan");
		}
		else {
			System.out.println("Normal Hooman");
		}
		System.out.println(num+s);
		String anime = (num ==1 && s.equals("Piece"))? "Gomu Gomu no... " : "Jet Gattling" ;
		System.out.println(anime);
	}
	
}
