package com.abstraction;

public abstract class Test1 {

	Test1(){
		this(10);
		System.out.println("default constuctor");
		
	}
	Test1(int a){
		System.out.println("para constructor");
	}
	
	public abstract void m1();
	
	void m2() {
		System.out.println("m2 method");
	}
	
	
}
