package com.practice;

import java.io.IOException;

public class Child extends Parent{

	
	@Override
	public void m1() throws ArithmeticException {
		System.out.println("m1-child class method");
	}
	@Override
	//no exaption,same or child exception in child class
	public void m2() throws IOException{
		System.out.println("m2 -child class");
	}
}
