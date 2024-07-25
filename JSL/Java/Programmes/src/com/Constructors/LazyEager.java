package com.Constructors;

public class LazyEager {
	public static void main(String[] args) {
		LazyEager Le = new LazyEager();  // Eager - Spring uses this
		LazyEager lE;         //Lazy
		lE= new LazyEager();
	}

}
