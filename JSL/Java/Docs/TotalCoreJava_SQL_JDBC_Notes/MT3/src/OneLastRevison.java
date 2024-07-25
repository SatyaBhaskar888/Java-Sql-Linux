
public class OneLastRevison {

	public static void main(String[] args) {
		T11 t11 = new T11();
		Thread t1 = new Thread(new T11());
		Thread t2 = new Thread(new T12());
		
		t1.start();
		t2.start();

		for (int i = 10; i < 20; i++) {
			System.out.println("Main");
			Thread.yield();

		}
	}

}

class T11 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
	}
}
class T12 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Grand child");
			

		}
	}
}
