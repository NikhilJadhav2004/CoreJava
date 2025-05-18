package superthis;

public class Child extends Parent {
	
    int a=40;
	public Child() {
		super.m1();
		System.out.println("child class constructot");
	}
	public void m3 () {
		this.m4();
		System.out.println("child method 1");
   }
	public void m4() {
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println("child method 2");
	}
}
