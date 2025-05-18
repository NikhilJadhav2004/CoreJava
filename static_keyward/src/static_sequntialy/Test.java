package static_sequntialy;

public class Test {
//static data sequentialy exicute
	static int i=m1();
	static {
		System.out.println("static block");
	}
	public static int m1(){
		System.out.println("normal method");
		return 60;
	}
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(i);
	}
	
}
