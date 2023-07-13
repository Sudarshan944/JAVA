package Current;

public class MyThread extends Thread{
	private void syso() {
		// TODO Auto-generated method stub
		System.out.println("System Thread");
	}
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
	}
}
