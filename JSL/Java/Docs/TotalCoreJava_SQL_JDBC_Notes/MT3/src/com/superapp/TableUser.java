package com.superapp;

public class TableUser {
	public static void main(String[] args) {
		
		MyTable mt=new MyTable();
		
		U1 u1=new U1();
		U2 u2=new U2();
		u1.t=mt;
		u2.t=mt;
		
		u1.start();
		u2.start();
		
		
	}

}
class U1 extends Thread{
	
	MyTable t;
	
	@Override
	public void run() {
		t.printTableData(2);
	}
	
}

class U2 extends Thread{
	
	MyTable t;
	
	@Override
	public void run() {
		t.printTableData(3);
	}
	
}
