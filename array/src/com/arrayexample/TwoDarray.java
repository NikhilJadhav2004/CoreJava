package com.arrayexample;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		
		System.out.println("enter the number of row");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("enter the number of colume");
		int col=sc.nextInt();
		int [][]a=new int[row][col];
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=col;j++) {
				a[i][j]=sc.nextInt();
			}
			
			for(int i1=0;i1<=row;i1++) {
				for(int j=0;j<=col;j++) {
					System.out.println(a[i1][j]);
				}
				System.out.println();
		}
		
		
		
		
		
	}
	}
}
