package com.Basics;
import java.util.Scanner;

public class Scanner_features {
	public static void main(String[] args) {
		IntScanner();
		//sc.nextLine().charAt(0)
	}

	private static void IntScanner() {
		Scanner sc = new Scanner(System.in);
//		Student s = new Student();
		// The above method shows how to create a method for class(Student)
		// new is for creation of object
		// sc is the scanner object
		System.out.println("Scanner Can be used Dynammmically");
		int age=sc.nextInt();
		//nextInt() is a method which takes integer input at runtime and assigns it to the variable
//		byte b= sc.nextByte();
//		short s = sc.nextShort();
//		double d = sc.nextDouble();
//		float f = sc.nextFloat();
//		long l = sc.nextLong();
		
		System.out.println("my age is " + age);
	}

}
