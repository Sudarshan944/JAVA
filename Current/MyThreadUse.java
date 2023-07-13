package Current;

public class MyThreadUse{
	public static void main(String[] args) {
	MyThread obj = new MyThread();
	Thread t = new Thread(obj);
	obj.start();
	}
}
