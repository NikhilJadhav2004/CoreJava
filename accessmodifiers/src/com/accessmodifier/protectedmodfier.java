package com.accessmodifier;

public class protectedmodfier {
	//same package-same class,outside the class
	//outside package-parent child relation-
	//create the object of child class
	//use-variable,method ,constructor
	protected protectedmodfier() {
		System.out.println("protected constructor");
	}
    protected int a=10;
	
	protected void m1() {
		System.out.println("protected method");
	}
	public static void main(String[] args) {
		protectedmodfier p=new protectedmodfier();
		System.out.println(p.a);
		p.m1();
	}

}
class A extends protectedmodfier{
	public static void main(String[] args) {
		//create the object of parent class
		System.out.println("parent a object");
		A a=new A();
		System.out.println(a.a);
		a.m1();
		System.out.println(" child object");
		protectedmodfier p=new protectedmodfier();
		System.out.println(p.a);
		p.m1();
	}
}
