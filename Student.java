public class Student {
	int rollno;
	String name;
	/*
	 *  this keyword is used to access current instance of the class and is used to access variable that belong to the class
	 *  this keyword used when the attribute and data member share the same name
	 */
	
	Student(String n){
		name=n; //String default null
	}
	/*
	 * Final Keyword
	 * when you make a variable final we can't change the value of the variable
	 * we cannot declare the constructor which are not able to fulfill the requirements of final variable
	 */
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