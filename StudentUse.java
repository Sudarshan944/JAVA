public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class object created
		Student s1=new Student("nani",53);
		// assign value to instance variables
		System.out.println("Student Name :"+s1.name);
		System.out.println("Student RollNo :"+s1.rollno);
		
		System.out.println();
		
		
		Student s2=new Student("reddy");
		// assign value to instance variables
		s2.rollno=52;
		System.out.println("Student Name :"+s2.name);
		System.out.println("Student RollNo :"+s2.rollno);
	}

}
