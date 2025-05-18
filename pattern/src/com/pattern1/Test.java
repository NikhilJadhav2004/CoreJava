package com.pattern1;

public class Test {
	//print
	//200
	//400  600
	//300 
	//600 900 1200
	//400
	//800 1200 1600 2000
	public static void main(String[] args) {
		
	
	for(int i=2;i<5;i++) {
		for(int j=1;j<=i+1;j++) {
			System.out.print(i*j*100+" ");
			if(j==1) {
				System.out.println();
			}
		}
		System.out.println();
	}
	

}
}
	
