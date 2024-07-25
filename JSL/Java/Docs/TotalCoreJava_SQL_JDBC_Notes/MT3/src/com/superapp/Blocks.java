package com.superapp;

public class Blocks {

	public static void main(String[] args) {
		System.out.println("Hi");//
		Blocks b1=new Blocks();
		Blocks b2=new Blocks();
		System.out.println("Bye");
	}
	static {
		System.out.println("s-1");
		new Blocks();
	}
	static {
		System.out.println("s-2");
	}
	{
		System.out.println("i-3");
	}

}
