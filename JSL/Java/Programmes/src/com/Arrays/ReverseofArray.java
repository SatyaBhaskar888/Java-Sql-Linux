package com.Arrays;

public class ReverseofArray {
	public static void main(String[] args) {
//		RevintonewArray();
		RevSameArray();
	}

	private static void RevSameArray() {
		int[] a = {1,2,3,4};
		int start = 0;
		int end = a.length-1;
		while(start<=end) {
			int temp = a[start];
			a[start]= a[end];
			a[end]= temp;
			start++;
			end--;
		}
		for (int temp : a) {
			System.out.println(temp);
		}
	}

	private static void RevintonewArray() {
		int[] a = {1,2,3,4};
		int[] b = new int[a.length];
		int j = a.length-1;
		for(int i = 0; i<a.length; i++) {
			b[j]=a[i];
			j--;
			
		}
		for(int temp:b) {
			System.out.println(temp);
		}
	}

}
