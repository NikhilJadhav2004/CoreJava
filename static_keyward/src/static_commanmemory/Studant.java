package static_commanmemory;

public class Studant {
	//static keyward is used for memory management,use-comman data
	//it is used before variable,inner class,method,block
	//at the time class loading its intialise memory that is comman
	//stsic data execute sequentily
	//with in same class data direct acess and outside the class data acess with classname.varable name,does not nead object creation
	int id=40;
	String name;
	static final String collage="jspm";
	static {
		System.out.println("-----");
	}
	
	public static void m1() {
		System.out.println("_____@@@@_____");
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+collage);
	}
	public static void main(String[] args) {
		Studant s=new Studant();
		s.id=56;
		s.name="abhi";
		
		
	
		Studant s1=new Studant();
		s1.id=57;
		s1.name="nikhil";
		s.display();
		s1.display();
		s.m1();
		
				
	}
	
	
	

}
