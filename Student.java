public class Student {
	int rollno;
	String name;
	Student(String n){
		name=n; //String default null
	}
	Student(String n,int rn){
		name=n;
		rollno=rn; // int default 0
		// boolean default false
	}
	// By creating methods in the class we are able to access private data members
	public void print() {
		System.out.println(name+" "+rollno);
	}
	/*
	 * Access private data members outside class we use getter and setter methods
	 */
//	public void setRollNo(int rn) {
//		if(rn<=0) {
//			System.out.println("Please enter valid RollNo");
//		}else {
//			rollno=rn;
//		}
//	}
//	public int setRollNo() {
//		return rollno;
//	}
}