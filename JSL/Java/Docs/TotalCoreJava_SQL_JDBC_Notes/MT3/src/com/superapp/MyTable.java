package com.superapp;

public class MyTable {

	static void printTableData(int n) {
		synchronized (MyTable.class) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
