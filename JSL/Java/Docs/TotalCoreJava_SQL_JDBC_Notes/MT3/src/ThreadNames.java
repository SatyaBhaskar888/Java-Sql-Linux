
public class ThreadNames {

	public static void main(String[] args) {
	}

	private static void settingPriorityToGivenThread() {
		Thread myCurrentThreadObject = Thread.currentThread();
		int priority = myCurrentThreadObject.getPriority();
		System.out.println("My priority is " + priority);
		myCurrentThreadObject.setPriority(100);
		System.out.println(myCurrentThreadObject.getPriority());
	}

	private static void namingFunction() {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println(currentThreadName + "  is running");
		Thread.currentThread().setName("Na Thread Na Istam");
		String currentThreadName2 = Thread.currentThread().getName();

		System.out.println(currentThreadName2 + "  is running");
	}

}
