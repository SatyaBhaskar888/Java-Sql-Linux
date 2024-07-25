
public class Table {

	void printTable(int n) throws InterruptedException {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);
				Thread.sleep(1000);
			}
		}
		
		
		
		
		
		
	}

}
