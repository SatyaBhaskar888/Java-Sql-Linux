
public class SyncDemo2 {

	public static void main(String[] args) throws InterruptedException {
		T13 t13 = new T13();
		t13.start();

		synchronized (t13) {
			t13.wait();//main will wait for t13 notification
			System.out.println("Main thread printing result");
			System.out.println(t13.total);

		}
	}

}

class T13 extends Thread {
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			this.notifyAll();
		}
	}

}
