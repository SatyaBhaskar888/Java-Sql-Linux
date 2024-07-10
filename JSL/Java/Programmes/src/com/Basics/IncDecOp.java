package com.Basics;

public class IncDecOp {
	public static void main(String[] args) {
		int a= 10;
//		a++;// Post increment Operator
		System.out.println(++a);// increases before
//		++a;//Pre Increment operator
		System.out.println(a++);// increase after the statement
		System.out.println(a);
		a--;
		--a;
		System.out.println(a);
	}

}
