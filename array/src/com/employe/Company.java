package com.employe;

public class Company {
	public static void main(String[] args) {
		
		Deparment d=new Deparment();
		Employe[] einfo=d.addinfo();
		for(Employe a:einfo) {
			System.out.println(a.getAdress()+" "+a.getName()+" "+a.getSalry()+" "+a.getAdress());
		}
		
		
	}

}
