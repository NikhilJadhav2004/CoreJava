package com.car;

import com.abstraction.Mahendra;

public class Controller {

	public static void main(String[] args) {
		
		Car c1=new TATA();
		
		c1.carColure();
		c1.tyers();
		c1.specifiction();
		
		System.out.println("___________________________");
		Car c2=new Maruti();
		c2.carColure();
		c2.tyers();
		c2.specifiction();
		
		
	}
}
