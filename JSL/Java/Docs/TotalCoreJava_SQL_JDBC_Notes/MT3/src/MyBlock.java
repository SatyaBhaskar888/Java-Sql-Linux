
public class MyBlock {
	
	
	public static void main(String[] args) {
		System.out.println("Hi");
		MyBlock v1=new MyBlock();
		MyBlock v2=new MyBlock();
		System.out.println("Bye");
	}
	static {
		System.out.println("I am static block-1");
	}
	static {
		System.out.println("I am static block-2");
	}
	
	{
		System.out.println("I am instance block-3");
	}
	
	
}
