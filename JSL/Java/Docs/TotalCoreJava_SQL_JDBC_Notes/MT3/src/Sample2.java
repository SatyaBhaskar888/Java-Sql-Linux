class scnd implements Runnable
{
	public void run()
	{ 
		for (int i = 1 ; i < 5;i++)
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Hey i am from inbuilt Runnable");
	}
}

public class Sample2 {

	public static void main(String[] args) 
	{
		scnd s = new scnd();
		Thread t = new Thread(s);
		t.start();
		

	}

}
