package practice;

public class Test2 extends Test1 {

	public Test2() {
		
		System.out.println("child class constructor");
	
	}
	public void m2() {
		System.out.println("--child method--");
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
	}
}
