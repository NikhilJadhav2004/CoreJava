package valueSetDiffWay;

public class UsingConstructor {

	int id;
	String name;
	double mark;
	
	public UsingConstructor(int id,String name,double mark) {
		
		this.id=id;
		this.name=name;
		this.mark=mark;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+mark);
	}
	public static void main(String[] args) {
		UsingConstructor om=new UsingConstructor(58, "om", 90.9);
		om.display();
		
		System.out.println("---------------------------------");
		
		UsingConstructor raj=new UsingConstructor(78,  "sham", 90.22);
	raj.display();
		
	}
}
