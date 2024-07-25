
public class Join2Demo {

	public static void main(String[] args) throws InterruptedException {
		T t1 = new T();
		t1.start();

		Thread.sleep(100);
//		t1.join();
		Thread.yield();
		System.out.println(t1.sum);

	}

}

class T extends Thread {
	int sum = 0;

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			sum = sum + i;

		}
	}

}
