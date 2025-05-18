package coherant_returntype;

public class Test {

	public Vehical m1() {
		Vehical v=new Vehical();
		Car c=new Car();
		return c;
	}
	public Car m2() {
		Car c=new Car();
		Vehical v=new Vehical();
		Tata t=new Tata();
		Mahindra m=new Mahindra();
		return c ;
		
	}
	public static void main(String[] args) {
		Test t=new  Test();
		Vehical v=t.m1();
		v.show();
		Car c=t.m2();
		c.run();
		
	}
}
