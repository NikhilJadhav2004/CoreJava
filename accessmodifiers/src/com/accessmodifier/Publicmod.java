package com.accessmodifier;

public class Publicmod {
	//class is public or default then constructor is also public or default
    //everywhare
	//use-class,method,construtor,variable;
	public Publicmod(){
    	 System.out.println(" public constructor");
     }
	public int a=10;
	public void m1() {
		System.out.println("public method");
	}
	public static void main(String[] args) {
		Publicmod p=new Publicmod();
		System.out.println(p.a);
		p.m1();
	}
	
}
