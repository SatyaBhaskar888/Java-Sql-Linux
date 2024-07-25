
public class DeadLock {
	public static void main(String[] args) {
		Upendra upendraClassObject = new Upendra();
		Students studentClassObject = new Students();
		upendraClassObject.students=studentClassObject;
		studentClassObject.upendra=upendraClassObject;
		
		upendraClassObject.start();
		studentClassObject.start();
	}

}

class Upendra extends Thread {

	Students students;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				students.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi");
		}
	}

}

class Students extends Thread {

	Upendra upendra;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				upendra.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello");
		}
	}

}
