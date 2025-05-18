package allblocks;

public class Test2 {

	static {
		
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
	
	Test2()
	{	
		System.out.println("Constructor");
	}
	
	void m1() {
		System.out.println("m1");
	}
	public static void main(String[] args) {
		
		Test2 t=new Test2();
		t.m1();
	}
	
	
}
