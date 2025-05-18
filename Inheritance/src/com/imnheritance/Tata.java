package com.imnheritance;
//multilavel inheritance
public class Tata extends CarmusicSystem {
	public void tataCar() {
		System.out.println("tata class");
	}
	
	public static void main(String[] args) {
		Tata sc =new Tata();
		   sc.tataCar();
		   sc.car();
		    sc.m1();
	}
}

