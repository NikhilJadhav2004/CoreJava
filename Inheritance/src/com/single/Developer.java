package com.single;

public class Developer extends Employe {
	 
	int rollno;
	@Override
	public void display() {
		System.out.println("override method");
	}
	public void show() {
		System.out.println("developer method");
	}
	public static void main(String[] args) {
		//child object
//		Developer d=new Developer();
//		d.rollno=67;
//		System.out.println(d.rollno);
//		d.show();
//		d.name="nikhil";
//		System.out.println(d.name);
//		d.display();
		//mix object
		Employe e=new Developer();
		System.out.println(e.name);
		e.display();
		//parent object
		Employe r=new Employe();
		r.name="abhi";
		System.out.println(r.name);
		r.display();
		
		
	}
	 
}
