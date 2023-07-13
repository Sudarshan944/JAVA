package Current;

public class Current {
	public static void main(String[] args) {
		System.out.println("Let us find the current thread: ");
		Thread t = new Thread().currentThread();
		System.out.println("Current Thread :"+t);
		System.out.println("Current Thread Name :"+t.getName());
	}
}
