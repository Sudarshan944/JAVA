package Current;

public class MultiTasking implements Runnable{
	String str;
	public MultiTasking(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(str+" "+i);
		}
	}
}
