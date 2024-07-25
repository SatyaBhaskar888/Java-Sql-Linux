package com.Arrays;

public class MissingNumberArray {
	public static void main(String[] args) {
		int[] input = {3,2,0,5,4};
		int sum = 0;
		for (int i:input) {
			sum= sum+i;
		}
		int n = input.length;
		int final_sum = n*(n+1)/2;
		System.out.println("missing Number" + (final_sum- sum));
	}

}
