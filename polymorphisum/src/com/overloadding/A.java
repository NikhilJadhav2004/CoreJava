package com.overloadding;
//advatges of overloading -code redebality
//with in same class
//method name same-diff parameter
//acccess modifier and return type does not matter
//main,static ,final ,private method we can overload
public class A {
	static int  a=10;
	
	
	
	public static void add(int a) {
		System.out.println("value of a is"+a);
	}
	public static void add(int a,int b) {
		System.out.println("addition is"+(a+b));
		
	}
	static {
		System.out.println("main");
	}
	public static void main(String[] args) {
		add(90);
		add(5, 50);
		a=90;
		System.out.println(a);
	}
	
}
