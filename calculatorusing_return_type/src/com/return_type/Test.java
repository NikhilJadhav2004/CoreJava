package com.return_type;

public class Test {
	public int add(int a,int b) {
		int j=a+b;
		return j;
		
	}
	public int sub(int a,int b) {
		int j=a-b;
		return j;
	}
	public int mult(int a,int b) {
		int j=a*b;
		return j;
		
	}
	public int div(int a,int b) {
		int j=a/b;
		return j;
	}
	public static void main(String[] args) {
		Test obj=new Test();
		int p=obj.add(33,47);
		System.out.println("additon="+p);
		int q=obj.sub(70,20);
		System.out.println("substraction="+q);
		int r=obj.mult(5,5);
		System.out.println("multipliation="+r);
		int t=obj.div(50, 10);
		System.out.println("division="+t);
	}

}
