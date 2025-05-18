package com.arrayexample;

import java.util.Scanner;

public class Test {
	
	//array is a collection of object or element
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of element add");
		int j=sc.nextInt();
		int[] a=new int[j];
		for(int i=0;i<=j;i++) {
		a[i]=sc.nextInt();
		}
		//for each loop,java1.7
		for(int b:a) {
			System.out.println(b);
			
		}
		//System.out.println(a.length);
	}

}
