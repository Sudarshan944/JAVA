
public class Demo_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int n=args.length;
		System.out.println(n);
		int a=45/n;
		System.out.println("a = "+a);
		int b[] = {10,20,30};
		b[30]=100;
	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
		System.out.println(ae);
		System.out.println("Please Pass the data");
	}
//	catch(ArrayIndexOutOfBoundsException aie) {
//		aie.printStackTrace();
//		System.out.println("Please check array index is in range or not");
//	}
	finally {
		System.out.println("Close the file");
	}
	}

}
