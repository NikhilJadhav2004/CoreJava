package condition;

import java.util.*;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value a&b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean flag = (a > b);
		System.out.println(flag);
		if (a > b) {
			System.out.println("a is grether");
		} else {
			System.out.println("b is grether");
		}

	}

}
