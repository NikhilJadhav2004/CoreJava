package com.accessmodifier;

public class B extends A {
	public static void main(String[] args) {
		
		A a=new A();
		//same package
		//public
		a.m2();
		System.out.println(a.a);
		a.m1();
		//protected
		System.out.println(a.b);
		a.m2();
		//default 
		System.out.println(a.c);
		a.m3();
		//private-with in same class
		//System.out.println(a.d);
		//a.m4();
		B b=new B();

		
		System.out.println(b);
		
		
	}

}
