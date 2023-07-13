package Current;

public class TrainTickets implements Runnable{
	int available=1;
	int wanted;
	public TrainTickets(int i) {
		wanted=i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
		System.out.println("Available Berths are :"+available);
		if(available>=wanted) {
			String name = Thread.currentThread().getName();
			System.out.println(wanted+"Berth reserved for "+name);
			try {
				Thread.sleep(1500);
				available-=wanted;
			}catch(InterruptedException e) {
				
			}
		}else {
			System.out.println("Sorry No berths available");
		}
		}
	}
}
