
public class SmartApp {
	public static void main(String[] args) {
		Table t = new Table();

		TB1 tb1 = new TB1(t);
		TB2 tb2 = new TB2(t);

		tb1.start();
		tb2.start();

	}

}

class TB1 extends Thread {
	Table t;

	public TB1(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		try {
				
				t.printTable(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class TB2 extends Thread {
	Table t;

	public TB2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		try {
			t.printTable(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
