package exception_handling;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("----main method----");
		Scanner sc=new Scanner(System.in);
		//memory lecage-then close classes
		try {
			System.out.println("--try block---");
			int a=20/0;
			System.out.println("a="+a);
		} catch (Exception e) {
			System.out.println("---catch block----");
			e.printStackTrace();
		}finally {
			//System.exit(0);-using this finally block does not execute
			//finally block always exicute
			System.out.println("--finally block---");
			sc.close();
		}
	}
}
