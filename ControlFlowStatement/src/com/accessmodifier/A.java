package com.accessmodifier;

public class A {

	public int a=10;
    protected int b=20;
	int c=30;
	private int d=40;
	
	public void m1() {
		System.out.println("public method");
	}
	protected void m2() {
		System.out.println("protected method");
	}
	void m3() {
		System.out.println("default method");
	}
	private void m4() {
		System.out.println("private method");
	}
	
	/*
	 * public static void main(String[] args) { //with in class A a=new A();
	 * System.out.println(a.a); a.m1(); System.out.println(a.b); a.m2();
	 * System.out.println(a.c); a.m3(); System.out.println(a.d); a.m4(); }
	 */
}
