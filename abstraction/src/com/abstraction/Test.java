package com.abstraction;

public class Test extends Test1 {
	/*
	 * public static void main(String[] args) { //we can not create the object of
	 * abstract class //mix object-we can acess parent+overrided method in child
	 * class Vehical v=new Mahendra(); v.wheal(); v.specification(); v.color();
	 * //child object -parent +child Tata t=new Tata(); t.wheal();
	 * t.specification(); t.color();
	 * 
	 * }
	 */
	public Test() {
		super();
		System.out.println("child constructor");
		
	}
	
	public static void main(String[] args) {
		
		Test1 t=new Test();
		t.m1();
		t.m2();
	}

	@Override
	public void m1() {
		
		System.out.println("implimented method in child class");
		
	}

}
