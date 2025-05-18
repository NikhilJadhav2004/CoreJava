package com.finalkeyward;

public final class Test {
	//final is keyward
	//it is provied the restriction in data
	//if we have to create the variable as final -at this time variable is intialised
	//use-variable,method,class;
	final int b;
	public Test() {
		b=80;
	}
	final int a=20;
	
	public void m2() {
		System.out.println("normal method");
	}
	 
	public final void m1() { 
		System.out.println("final method");
	}
	public void m3(final int a,final int b) {
		
		System.out.println(a+" " +b);
	}
	public static void main(String[] args) {
		Test t=new Test();
		
		System.out.println(t.a);
		t.m3(600, 800);
		System.out.println(t.b);
	}

}
