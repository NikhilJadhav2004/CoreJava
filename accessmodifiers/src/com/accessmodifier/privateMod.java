package com.accessmodifier;

public class privateMod{
	
	//access with in same class
	
	//use- variable,constructor,method
	
	private privateMod() {
		System.out.println("private constructor");
	}
	private int a=10;
	
	private void m1() {
		System.out.println("__--private method--__");
	}
	private static void main(String[] args) {
		privateMod a=new privateMod();
		System.out.println(a.a);
		a.m1();
	}
	
}
