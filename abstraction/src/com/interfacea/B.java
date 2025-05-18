package com.interfacea;

public class B  implements A ,C{

	@Override
	public void m1() {
		
		System.out.println("method 1st");
	}

	@Override
	public void m2() {

		System.out.println("method 2nd");
	}

	public static void main(String[] args) {
		 C a=new B();
		a.m1();
	}
	

}
