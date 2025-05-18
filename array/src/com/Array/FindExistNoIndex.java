package com.Array;

import java.util.Scanner;

public class FindExistNoIndex {

	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("entre the size");
		int size=sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter the element");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("entre no you chek the no is present or not");
		
		int b=sc.nextInt();
		
		for(int j=0;j<a.length;j++) {
			
			if(a[j]==b) {
				System.out.println("given no"+ b +"is present at index:"+j);
			}
		}
	}
}
