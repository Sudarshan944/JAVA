import java.util.Scanner;
public class Test {
public static void main(String[] args) {
//	System.out.println("Hello World");
//	System.out.print("Hii");
//	int a=10;
//	System.out.println("Value of a:"+a);
//	int x;
	Scanner sc = new Scanner(System.in);
//	x=sc.nextInt();
//	System.out.println("Value of x:"+x);
//	String s;
//	System.out.print("Enter your name: ");
//	s=sc.nextLine();
//	System.out.println("The user name is "+s);
//	Addition
//	int a,b;
//	System.out.print("Enter a value ");
//	a = sc.nextInt();
//	System.out.print("Enter b value ");
//	b = sc.nextInt();
//	System.out.println("Sum of a and b is "+(a+b));
//	int a=5;
//	System.out.println(a++);
//	System.out.println(++a);
	int a=10;
	int b=25;
	int c=35;
	if (a>b && a>c){
		System.out.println("A is greater than B and C");
	}else if (b>c){
		System.out.println("B is greater than A and C");
	}else {
		System.out.println("C is greater than A and B");
	}
}
}
