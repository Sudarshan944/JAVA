package vehicle;

public class Car extends Vehicle{
	public Car(int maxSpeed,int numGears) {
		super(maxSpeed);
		this.numGears=numGears;
		System.out.println("Car Constructor");
	}
	
	int numGears;
//	public Car(int numGears) {
//		this.numGears=numGears;
//	}
	
	public void print() { //overriding
		super.print();
		System.out.println("Car gears :"+numGears);
	}

}
