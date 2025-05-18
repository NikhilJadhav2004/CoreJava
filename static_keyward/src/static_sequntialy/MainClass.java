package static_sequntialy;

public class MainClass {
	//heap memory store object
	int id=20;
	static String s="Nikhil";
	
	public void display() {//non static method
		//static+non-static data acess
		System.out.println(id);
		System.out.println(s);
		}
	public static void run() {
		//static method-only acess static data-not non-static
		//non static data after object creation call
		System.out.println("static method");
		System.out.println(s);
		MainClass m=new MainClass();
		System.out.println(m.id);
	}
	public static void main(String[] args) {
		MainClass a=new MainClass();
		a.id=30;
		a.display();
		a.run();
	}

}
