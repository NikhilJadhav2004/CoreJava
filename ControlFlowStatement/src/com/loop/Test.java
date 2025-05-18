package com.loop;

public class Test {
	int sum = 0;

	void display() {
		// 100 to 200 sum of number
		for (int i = 100; i <= 200; i++) {
			sum = sum + i;
		}
		System.out.println("sum of num:" + sum);
	}

	void run() {
		//100 to 200 odd number sum
		for (int i = 100; i <= 200; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of odd number is:" + sum);
	}
	void show() {
		//table
		for(int i=1;i<=10;i++) {
			int a=i*3;
			System.out.println("3*"+i+"="+a);
			
		}
	}
	void main() {
		boolean flag=true;
		while(flag){
			System.out.println("inside while loop");
			//break;
			flag=false;
		}
		System.out.println("main");
	}
	void sum() {
		int num=1;
		int sum=0;
		while(num<=5) {
			sum+=num;
			num++;
		}
		System.out.println("sum:"+sum);
	}
	

	public static void main(String[] args) {
		Test obj = new Test();
		obj.display();
		obj.run();
		obj.show();
		obj.main();
		obj.sum();
	}

}
