package com.employe;

public class Deparment {

	
	public Employe[] addinfo() {
		
		Employe e=new Employe();
		e.setEid(20);
		e.setName("nikhil");
		e.setSalry(45000.900);
		e.setAdress("pune");
		
		Employe e1=new Employe();
		e1.setEid(80);
		e1.setName("ramu");
		e1.setSalry(300000.80);
		e1.setAdress("pune");
		Employe[] info= {		e,e1};

		return info;
	}
}
