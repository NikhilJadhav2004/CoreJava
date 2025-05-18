package com.hirarchical;

public class Bike extends Vehical  {
	String name;
	@Override
	public void display() {
		System.out.println("--override vehical method");
	}
	
	public void bikeshow() {
		System.out.println("bike name:"+name);
		System.out.println("bike color:"+color);
		System.out.println("capacity:"+capacity);
	}
	
	

}
