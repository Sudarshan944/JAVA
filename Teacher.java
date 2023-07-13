
public class Teacher {
	int tid;
	String name;
	public Teacher() {
		System.out.println("Default Constructor");
	}
	public Teacher(int tid,String name) {
		this.tid=tid;
		this.name=name;
	}
	public static void main(String[] args) {
		Teacher t1 = new Teacher(121,"NEWBIE");
		System.out.println("Teacher ID: "+t1.tid);
		System.out.println("Teacher Name: "+t1.name);
	}

}
