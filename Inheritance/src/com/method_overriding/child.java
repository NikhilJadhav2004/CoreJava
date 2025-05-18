package com.method_overriding;

public class child extends parent{
	@Override
	public void sum() {
		int a=100;
		int b=200;
		System.out.println("override sum method");
		System.out.println("sum="+(a+b));
	}
	public void mul() {
		int a=3;
		int b=5;
		System.out.println("child class method");
		System.out.println("mul="+a*b);
	}
	public static void main(String[] args) {
		//3 way to object call
		parent p=new parent();
		p.sum(); p.sub();
		parent p1=new child();
		p1.sum();
		p1.sub();
		child c=new child();
		c.sum();
		c.sub();
		c.mul();
		
		
	}

}
