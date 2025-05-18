package com.method_overriding;

public class parent {
	
	public void sum() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("method of parent class");
		System.out.println("sum="+sum);
	}
	public void sub() {
		int a=30;
		int b=23;
		int sub=a-b;
		System.out.println("parent class method");
		System.out.println("sub="+sub);
	}

}
