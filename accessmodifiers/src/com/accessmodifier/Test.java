package com.accessmodifier;

public class Test {
	public static void main(String[] args) {
		Default a=new Default();
		System.out.println(a.b);
		a.m1();
		protectedmodfier p=new protectedmodfier();
		System.out.println(p.a);
		p.m1();
		}
	

}
