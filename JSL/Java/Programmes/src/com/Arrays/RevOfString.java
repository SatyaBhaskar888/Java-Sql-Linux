package com.Arrays;
import java.util.Scanner;

public class RevOfString {
	public static void main(String[] args) {
//		RevUsingStringBuilder();
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		char[] nameArray = name.toCharArray();
		//toCharArray is predefined in Java
		int start = 0;
		int end = nameArray.length - 1;
		while(start<=end) {
			char temp = nameArray[start];
			nameArray[start]=nameArray[end];
			nameArray[end]=temp;
			start ++;
			end --;
		}
		for (char c : nameArray) {
			System.out.println(c);
		}
	}

	private static void RevUsingStringBuilder() {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse());
	}

}
