package firstproject;


public class Test { 
	
	//we can create also multiple constructor with
	//diff parameter
	Test() {
		System.out.println("default constructor");
	}
	Test(int a){
		System.out.println("parameter"+a);
	}
	Test(int t,int w){
		System.out.println("two parameter");
	}
	int m1() {
		return 'a';
	}
	public void m2 (int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		
		Test t1=new Test(90);
		
		Test t2=new Test(1,2);
		int s=t.m1();
		System.out.println(s);
		t.m2(10);
		t.m2(33);
		
	}

}
