package com.pattern2;

public class Test {
	//*
	//*  *
	//*  *   *
	void pattern() {
		for(int i=1;i<4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	//* * *
	//* *
	//*
	void pattern1() {
		for(int i=1;i<4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	//1 
	//1 2
	//1 2 3
	void pattern2() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	//1 
	//2 2 
	//3 3 3
	void pattern3() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
		 System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Test t=new Test();
		t.pattern();
		System.out.println("----___-----");
		t.pattern1();
		System.out.println("----____----");
		t.pattern2();
		System.out.println("---__---");
		t.pattern3();
         System.out.println("----____----");
         
	}
}
