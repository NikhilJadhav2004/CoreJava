package throws_keyward;

import java.util.Scanner;

//throw keywards
//single exception throw
//inside method use
//depends on condition
public class Example1 {

	public static void validationage(int age) {
		
		if(age>18) {
			System.out.println("eligible to create the account");
		}
		else {
			//ArithmeticException ac=new ArithmeticException();
			throw  new ArithmeticException("you are not eligible");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		try {
			validationage( a);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
