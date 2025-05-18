package allblocks;

public class Test {
	
	int a=30;
	
	//static block calling before the main method
	//at the time of class loading static block is loadded
	//static block is used to write the username ,password,url..etc
	static {
		System.out.println("----static block-----");
	}
	
	Test(){
		a=200;
		System.out.println("---default constuctor----");
	}
	{  
		a=300;
		System.out.println("----non-static block");
	}
	public void m1() {
		System.out.println("---m1 method -----");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("--main method_---");
		Test obj=new Test();
		System.out.println(obj.a);
		obj.m1();
	}
	

}
