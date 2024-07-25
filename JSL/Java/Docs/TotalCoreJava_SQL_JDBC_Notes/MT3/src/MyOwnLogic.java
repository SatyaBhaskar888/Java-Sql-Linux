
public class MyOwnLogic {

	public static void main(String[] args) {
		D1 d1 = new D1();
		D2 d2 = new D2();
		d1.d2 = d2;
		d2.d1 = d1;

		d1.start();
		d2.start();
	}

}

class D1 extends Thread {

	D2 d2;

	@Override
	public void run() {
		try {
			d2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("I am T0/D1 thread");
	}

}

class D2 extends Thread {

	D1 d1;

	@Override
	public void run() {
		try {
			d1.join();
		} catch (InterruptedException e) {
		}
		System.out.println("I am t1/D2 thread");
	}

}
