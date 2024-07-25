package com.Constructors;

public class Employee {
	int id;
	String name;
	public static void main(String[] args) {
		Employee e = new Employee(100,"XD");
		System.out.println(e.id);
	}
	Employee(int studentID, String studentname){
		//this ---> keyword which refers to current object
		this.id = studentID;
		this.name = studentname;
	}
}
