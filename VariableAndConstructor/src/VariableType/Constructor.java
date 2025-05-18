package VariableType;

public class Constructor {

	//constructor is used to intiliaztion of instance variable
	int a;
	String b;
	
	 Constructor(int c,String name) {
		a=c;
		b=name;	 
	}
	 public static void main(String[] args) {
		
		 Constructor c=new Constructor(101, "Nikhil");
		 System.out.println(c.a+"  "+c.b);
		 
		 
		 System.out.println("----------------------------------------------------");
		 
		 Constructor c2=new Constructor(102, "Savita");
		 System.out.println(c2.a+"  "+c2.b);
	}
	
	
}
