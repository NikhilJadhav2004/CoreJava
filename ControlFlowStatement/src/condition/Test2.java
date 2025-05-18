package condition;

import java.util.*;

public class Test2 {

	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mounth");
		int m = sc.nextInt();
		if (m == 1) {
			System.out.println("jan");
		}
		if (m == 2) {
			System.out.println("feb");

		}
		if (m == 3) {
			System.out.println("march");
		}
		if(m==4) {
			System.out.println("april");
		}
		else 
			System.out.println("error");

	}

	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.display();

	}

}
