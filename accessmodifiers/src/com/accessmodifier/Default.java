package com.accessmodifier;

 class Default {
	//same package -same class,outside the class
	//use-variable,method,constructor
	 Default() {
		// TODO Auto-generated constructor stub
	}
	int b=20;
	  
	void m1() {
		System.out.println("default method");
	}
	public static void main(String[] args) {
		Default d=new Default();
		System.out.println(d.b);
		d.m1();
		
	}
	
	

}
