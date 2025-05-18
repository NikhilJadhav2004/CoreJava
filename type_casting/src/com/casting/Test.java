package com.casting;

public class Test {
	//type casting -one data type is convert to the other data type;
	//1.implicit(automaticaly)-winding-small type convert to large type;
	//2.explicite (mannualy)-narrowing-large type convert to small type;
	public static void main(String[] args) {
		//implicite
		int a=299;
		
		//long
		double d=a;
		System.out.println(a);
		System.out.println(d);
		//expllicite
		double s=67.2344;
		int i=(int)s;
		System.out.println(s);
		System.out.println(i);
		
		float f=45.89f;
		double w=f;
		System.out.println(w);
		
	}
	

}
