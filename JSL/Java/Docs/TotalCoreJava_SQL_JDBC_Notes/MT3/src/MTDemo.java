
public class MTDemo {

	public static void main(String[] args) throws InterruptedException {
		MT2 t2=new MT2();//Extending Thread class
		MT3 t3=new MT3();
		Thread t4=new Thread(t3);
		t4.run();
		
		t2.start();

		for (int i = 0; i < 5; i++) {
			String currentThreadName = Thread.currentThread().getName();
			System.out.println("Current thread is  "+currentThreadName);
			System.out.println("Hello");

		}
	}

	private static void multipleWaysOfCreatingThread() {
		MT2 mt2=new MT2();//Extending Thread class
		MT3 mt3=new MT3();
		Thread t4=new Thread(mt3);
		t4.start();
		mt2.start();

		for (int i = 0; i < 5; i++) {
			String currentThreadName = Thread.currentThread().getName();
			System.out.println("Current thread is  "+currentThreadName);
			System.out.println("Hello");

		}
	}

}

class MT2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
//			Thread.currentThread().setName("t1 ");
			String currentThreadName = Thread.currentThread().getName();
			System.out.println("Current thread is  "+currentThreadName);
			
			System.out.println("Bye");

		}

	}

}

class MT3 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
//			Thread.currentThread().setName("t2 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String currentThreadName = Thread.currentThread().getName();
			System.out.println("Current thread is  "+currentThreadName);
			
			System.out.println("Bolo");

		}

	}

}
