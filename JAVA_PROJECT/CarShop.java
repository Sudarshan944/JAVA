package JAVA_PROJECT;
import java.util.*;
public class CarShop {
	public static void main(String[] args) {
	int carrank=0;
	int carcost=0;
	String[] carname =new String[]{"Polo Trendline",
		"Polo Highline",
		"Virtus Trendline",
		"Virtus Highline",
		"Taigun Trendline",
		"Taigun Highline",
		"Taigun Topline"
	};
	System.out.println("Choose the car");
	Scanner sc = new Scanner(System.in); 
	String cs=sc.nextLine();
	switch(cs) {
	case "Polo Trendline":
		carrank=1;
		carcost=870000;
		break;
	case "Polo Highline":
		carrank=2;
		carcost=1009000;
		break;
	case "Virtus Trendline":
		carrank=3;
		carcost=1105000;
		break;
	case "Virtus Highline":
		carrank=4;
		carcost=1308000;
		break;
	case "Taigun Trendline":
		carrank=5;
		carcost=1489000;
		break;
	case "Taigun Highline":
		carrank=6;
		carcost=1542000;
		break;
	case "Taigun Topline":
		carrank=7;
		carcost=1771000;
		break;
	}
//	int check = 0;
//	for(int i=0;i<carname.length;i++) {
//		if(carname[i]==carname[carcost]) {
//			check=-1;
//			break;
//		}
//	}
	if(carrank>7 || carrank<0) {
		System.out.println("Car name is wrong");
		cs = sc.nextLine();
	}
	System.out.println("Car has been selected"+carname[carrank-1]);
	System.out.println("Showroom cost:"+carcost);
	CarDetails cd = new CarDetails(carcost);
	System.out.println(cd.addrto(carcost));
}
}
