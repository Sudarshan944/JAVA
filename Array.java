
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {1,2,3,4,5};
//		System.out.println(a.length);
//		System.out.println(a[0]);
//		a[6]=15; // Error Array Index out of bounds
		int arr[]=new int[10];
		System.out.println(arr.length);
		arr[1]=10;
		arr[2]=20;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
