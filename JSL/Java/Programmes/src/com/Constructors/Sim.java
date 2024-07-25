package com.Constructors;

public class Sim {
	int aadhar;
	int voter;
	String pan;
	public static void main(String[] args) {
		Sim s = new Sim(738420, "FWOPB3156B");
		Sim S = new Sim(738420);
		System.out.println(s.aadhar);
		System.out.println(s.voter);
		System.out.println(s.pan);
		System.out.println(S.aadhar);
	}
	Sim(int aCard){
		this.aadhar= aCard;
		// Constructor makes it necessary to input value
	}
	Sim(int vCard,String pCard){
		this.voter = vCard;
		this.pan= pCard;
	}

}
