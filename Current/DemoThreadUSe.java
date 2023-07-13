package Current;

public class DemoThreadUSe implements Runnable{
	DemoThreadUSe obj =new DemoThreadUSe();
	Thread t = new Thread(obj);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Implementing Runnable");
	}	
}
