package VariableType;

public class Test {

	static int b=9;
	
	int a=3;
	
	void m1() {
		int a = 0;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		System.out.println(b);
		System.out.println(Test.b);
		
		Test t=new Test();
		System.out.println(t.a);
		t.m1();
		
	}
}
