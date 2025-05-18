package com.striing.equals.eqaloperator;
//eqals() method and equal operator
public class Test {

	//we have two method for object creation of string class
	//1>litral and 2> by using new keyward
	//new - if we have to create the object using new keyward then create heap memory and diff object points the diff values
	//litral-if we have to create the object as litral way then diff object haveing same value then its point the same value on a constant pool of heap memory
	public static void main(String[] args) {
		
		//equals method
		String s="java";
		String s1=s;
		String s2=new String("Java");
		String s3=s.concat("language");
		String s4=new String("Java");
		
		String s5="Java";
		String s6=new String("Java");
		
		
		System.out.println("----equals method__---");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s5));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s6));
		//any type of object it is compare
		
		
		System.out.println("=======equal operator======");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s2==s6);
		System.out.println(s5==s6);
		//its support only litral object
		
		
		
		
	}
}
