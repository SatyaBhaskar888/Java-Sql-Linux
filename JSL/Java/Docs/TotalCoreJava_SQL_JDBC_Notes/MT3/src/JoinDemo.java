
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		SecondThread secondThread = new SecondThread();
		secondThread.start();

		secondThread.join();
		Thread.sleep(150);
		System.out.println(secondThread.sum);

	}

}

class SecondThread extends Thread {

	int sum = 0;

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
