package throw_throws_keyward;

import java.util.InputMismatchException;

public class Tset {
	
	public void m1(int n) throws ArithmeticException,InputMismatchException {
		
		if(10/n !=0) {
			System.out.println("------------");
			System.out.println(10/n);
		}
	}
	
public static void main(String[] args) {
	
	Tset t=new Tset();
	
	int a = 0;
	t.m1(a);
	
	
}
}
