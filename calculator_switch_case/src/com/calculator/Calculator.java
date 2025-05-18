package com.calculator;

import java.util.Scanner;


public class Calculator {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();

	void add() {
		int sum = a + b;
		System.out.println("sum:" + sum);

	}

	void sub() {
		int sub = a - b;
		System.out.println("substraction:" + sub);
	}

	void mulp() {
		int mul = a * b;
		System.out.println("multiplication:" + mul);
	}

	void div() {
		int div = a / b;
		System.out.println("division:" + div);
	}

	public static void main(String[] args) {
		boolean flag = true;

		while (flag) {

			Scanner sc = new Scanner(System.in);
			System.out.println("**menu**");
			System.out.println("**1.addition**");
			System.out.println("**2.substraction**");
			System.out.println("**3.multiplication**");
			System.out.println("**4.division**");
			System.out.println("**5.exit**");

			System.out.println("enter the choice");
			int choice = sc.nextInt();
			if (choice != 5) {
				System.out.println("enter the first and 2nd value");
			}

			switch (choice) {
			case 1:
				Calculator obj = new Calculator();

				obj.add();
				break;
			case 2:
				Calculator d = new Calculator();

				d.sub();
				break;
			case 3:
				Calculator o = new Calculator();

				o.mulp();
				break;
			case 4:
				Calculator op = new Calculator();

				op.div();
				break;
			case 5:
				flag = false;
				System.out.println("stop calculator");
				break;
			default:
				System.out.println("enter valid choice");
				break;

			}
		}
	}
	
	

}
