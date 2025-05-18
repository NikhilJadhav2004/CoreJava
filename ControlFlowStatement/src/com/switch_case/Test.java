package com.switch_case;
import java.util.*;
public class Test {
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the valid mounth");
		int mounth=sc.nextInt();
		switch(mounth) {
		case 1: 
			System.out.println("jan");
			break;
		case 2: 
		     System.out.println("feb");
		     break;
		case 3:
			System.out.println("march");
			break;
		case 12:
			System.out.println("dec");
			break;
		default :
			System.out.println("enter the valid data");
		
		}
		
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.run();
	}
	 

}
