package superthis;

public class Parent {
	
	public int a=10;
	public Parent() {
		super();
		System.out.println("perent class constuctor");
	}
	public void m1() {
		int b=this.a;
		System.out.println(b);
		System.out.println("perent class method 1");
		
	}
	public void m2() {
		this.m1();
		System.out.println("parent method 2");
	}

}
