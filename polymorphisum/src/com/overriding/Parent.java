package com.overriding;

public class Parent {

	public void m1() {
		System.out.println("--m1 method--");
	}
	
	public void m2(int a) {
		System.out.println("value of a is:"+a);
	}
	int m3(int a) {
		return a;
	}
}
