package com.arrayexample;

public class Test1 {	
	//find minimum element in the array
	public static void arrayofint (int []array1) {
		int temp=array1[0];
		for(int i=1;i<5;i++) {
			if(temp>array1[i])
			{
				temp=array1[i];
			}
		}
		System.out.println("minimum element:"+temp);
		
	}
	
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		System.out.println("direct method using to to string");
		System.out.println("array elements:"+a.toString());
		int []array= {2,4,5,6,7};
		//using for each loop
		for(int i:array) {
			System.out.println(i);
				
		}
		//sum of element in the array
		int sum=0;
		int []a1= {12,78,9,5,7};
		for(int i=0;i<5;i++) {
			sum=sum+a1[i];
		
		}
		System.out.println("addition of all element:"+sum);
		//find maximum element in array
		int temp=a1[0];
		for(int i=1;i<5;i++) {
			if(temp<a1[i]) {
				temp=a1[i];
			}
		}
		System.out.println("maximum element:"+temp);
		//call the method
		int []array1= {30,50,20,10,40};
		arrayofint(array1);
				
		
		//reverse the array
		
		int []reverse= {1,2,3,4,5,6};
		int n=6;
		for(int i=0;i<=5;i++) {
		 reverse[n-1]=reverse[i];
		 n--;
		}
		System.out.println();
         
         
		
		}		
	}


