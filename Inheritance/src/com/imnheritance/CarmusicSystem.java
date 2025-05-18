package com.imnheritance;
//single inheritance
public class CarmusicSystem extends Vehicle{
	public void car() {
		System.out.println("music system");
	}
	public static void main(String[] args) {
		
		CarmusicSystem sc=new CarmusicSystem();
		sc.m1();
		sc.car();
	}
	
	}


