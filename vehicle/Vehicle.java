package vehicle;

public class Vehicle {
	String color;
	private int maxSpeed;
	public Vehicle(int maxSpeed){
		this.maxSpeed=maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed=maxSpeed;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public void print() {
		System.out.println(color+" "+maxSpeed);
//		System.out.println("Vehicle MaxSpeed :"+maxSpeed);
//		System.out.println("Vehicle Color :"+color);
	}

}
