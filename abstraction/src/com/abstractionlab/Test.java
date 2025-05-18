package com.abstractionlab;

public class Test {
	
public static void main(String[] args) {
	Shape s=new Rectangle();
	s.draw();
	Shape a=new Circle();
	a.draw();
	//losse coupling
	Shape r;
	r=new Circle();
	r.draw();
	r= new Rectangle();
	r.draw();
}
}
