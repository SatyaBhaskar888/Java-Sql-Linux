package com.summer;

public class Summer2 {
public static void main(String[] args) throws InterruptedException {
	T1 t1=new T1();
	t1.start();
	
	synchronized (t1) {
		t1.wait();
		System.out.println(t1.total);

	}
	}	

}

class T1 extends Thread{
	
	int total;
	
	@Override
	public void run() {
		
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total=total+i;
			}
			this.notify();
		}
		
	}
}
