package com.hirarchical;

public class Electricbike extends Bike {
	String ename;
	@Override
	public void bikeshow() {
		System.out.println("override bike method");
	}
	@Override
	public void display() {
		System.out.println("----");
	}
	
	void electricshow() {
		System.out.println("name="+ename);
	}
	public static void main(String[] args) {
		Electricbike e=new Electricbike();
		e.ename="tvs";
		System.out.println(e.ename);
		e.electricshow();
		e.name="honda";
		System.out.println(e.name);
		e.color="red";
		e.capacity=9067;
		e.bikeshow();
		e.display();
	}
	
	

}
