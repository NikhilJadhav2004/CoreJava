package static_keyward;

public class Test {
	//it is used to memory managment
	//comman data
	//sequentialy load
	//at the time of class loading
	//use before -variable, inner class,block,method

	static {
		System.out.println("static block");
		i=80;
	}
	static int i=m1();

	public static int m1() {
		System.out.println("m1 method");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(i);
	}

}
