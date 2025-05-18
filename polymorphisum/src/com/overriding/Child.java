package com.overriding;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("override m1 method");
	}
	@Override
	public void m2(int a) {
		System.out.println("value is:"+a);
	}
	@Override
	int m3(int a) {
		int c=a*a;
		return c;
	}
	public static void main(String[] args) {
		//mix object-its achived ovrrided and child class data
		Parent p=new Child();
		p.m1();
		p.m2(9);
		double d=p.m3(5);
		System.out.println(d);
		//parent obj acess parent data
		Parent p1=new Parent();
		int a=p1.m3(80);
		System.out.println(a);
		//child obj acess child datab
		Child s=new  Child();
		s.m1();s.m2(90);s.m3(80);
		
	}
}
