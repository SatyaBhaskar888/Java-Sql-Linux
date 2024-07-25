package com.Basics.Examples;
import java.util.Scanner;

public class EvenorOddWOCond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String[] result = {"Even","Odd"};
		System.out.println(result[x%2]);
	}

}
