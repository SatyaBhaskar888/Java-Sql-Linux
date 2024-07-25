package com.Arrays;

public class ReturnStatementandCallingMethods {
	public static void main(String[] args) {
		int result = SoN(5,6);
		System.out.println(result);
		GM("Bk");
		int reuse = sON(1,2,3,4);
		System.out.println(reuse);
	}
	static void GM(String name) {
		System.out.println("GM" + name);
	}
	
	static int SoN(int a, int b) {
		int res = a+b;
		return res;
	}
	static int sON(int... a) {
		// variable arguments for unknown number of input
		int sum = 0;
		for (int i:a) {
			sum = sum +i;
		}
		return sum;
	}

}
