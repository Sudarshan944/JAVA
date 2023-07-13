package vehicle;
public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle(100);
		v.color="Black";
//		v.maxSpeed=80;
		v.print();
//		System.out.println("Vehicle MaxSpeed :"+v.maxSpeed);
//		System.out.println("Vehicle Color :"+v.color);
		Car c=new Car(180,8);
		c.color="Red";
//		c.maxSpeed=180;
//		c.numGears=6;
//		System.out.println("Car color :"+c.color);
//		System.out.println("Car maxSpeed :"+c.maxSpeed);
		c.print();
	}

}
