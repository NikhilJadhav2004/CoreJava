package com.abstraction;

//abstaction-showing the esentail data at esential time
//two ways achived-1/abstract(class/method),2/interface
//we can't create the object of abstarct class
//parent child relation required
//in child class we can the override the abstract method
//maximum time mix object create;


public abstract class Vehical {
 
	public void wheal() {
		System.out.println("4 wheeal");
	}
	public abstract void specification();
	public void color() {
		System.out.println("white");
	}
	
}
