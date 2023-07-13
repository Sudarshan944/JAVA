package JAVA_PROJECT;

public class CarDetails {
	private final int rto = 113990;
	private final int Insurance = 47300;
	private final int tcs = 11000;
	private final int acc = 15000;
	int shcost;
	public CarDetails(int shcost) {
		this.shcost=shcost;
	}
	public int addrto(int addrt) {
		int rt = addtcs(this.tcs);
		return rt+rto;
	}
	private int addtcs(int addtc) {
		addtc=this.shcost+addtc;
		System.out.println(addtc);
		return addtc;
	}
}
