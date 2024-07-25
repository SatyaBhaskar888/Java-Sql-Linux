package com.Arrays;

import java.util.ArrayList;

public class Arrays {
	//Indexed collection of Homogeneous collection of Data
	public static void main(String[] args) {
//		ArrayEx();
//		ArrayListEx();
		ForEachLoop();
		
		
		
		
	}

	private static void ForEachLoop() {
		int[] aS4 = new int[5]; // 5 is the size of the array
		aS4[0]= 132;
		aS4[1]= 5908; // filling it with values or initialising an array
		
		for( int temp : aS4) {
			//aS4 - Source array
			System.out.println(temp);
		}
	}

	private static void ArrayListEx() {
		ArrayList al = new ArrayList();
		al.add("T");
		al.add(5);
		al.add(true);
		System.out.println(al);
	}

	private static void ArrayEx() {
		int[] m = {90,55,65};
		int[] arrayStyle1 = {1,2,3};
		int []aS2 = {4,5,6};
		int aS3[]= {7,8,9};
		int[] aS4 = new int[5]; // 5 is the size of the array
		aS4[0]= 132;
		aS4[1]= 5908; // filling it with values or initialising an array
		String[] s = {"E","T","H"};
		System.out.println("My " + s[1] + " marks are " + m[1]);
		int lengthOfm = m.length;
		for (int i = 0; i<aS4.length;i++) {
			System.out.println(aS4[i]);
		}
	}

}
