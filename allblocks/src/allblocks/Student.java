package allblocks;

public class Student {

	Student() {
		System.out.println("default constructor");
	} 

	static {

		System.out.println("static block");

	}
	{
		System.out.println("non static block");
	}

	public void m1() {
		System.out.println("method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Student s = new Student();
		s.m1();

	}
}
