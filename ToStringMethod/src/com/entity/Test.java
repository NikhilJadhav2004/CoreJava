package com.entity;

public class Test {

	
	 int id;
	 
	 String name;
	 
	 String Address;
	 
//	 @Override
	public String toString() {
		 return id+" "+name+" "+Address;
	}
	 
	 public static void main(String[] args) {
		Test t=new Test();
		
		t.id=16;
		t.name="omkar";
		t.Address="pune";
		
		System.out.println(t);//by default to string method is call
	}
}
