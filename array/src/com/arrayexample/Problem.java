package com.arrayexample;

public class Problem {

	
	public static void main(String[] args) {
		 int a[]= {10,30,69,33,68};
		 
		 //using for loop
		 for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		 }
		 //for each loop
		 System.out.println("foreach");
		 
		 for(int r:a) {
			 System.out.println(r);
		 }
		 
		 System.out.println("find max no in array");
		 
		 
}
}