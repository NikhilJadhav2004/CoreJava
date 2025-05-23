package valueSetDiffWay;

public class Usingmethods {

	int id;
	String name;
	char grade;
	
	void setinfo(int id,String name, char grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;	
	}
	static void collagename(String name){
		System.out.println("collage name:"+name);
	}
	void display() {
		collagename("jspm");
		System.out.println(id+" "+" "+name+" "+grade);
	}
	public static void main(String[] args) {
		
		Usingmethods om=new Usingmethods();
		om.setinfo(22, "om", 'a');
		om.display();
		System.out.println("---------------------------------------");
		

		Usingmethods om3=new Usingmethods();
		om3.setinfo(223, "om3", 'f');
		om3.display();
		System.out.println("---------------------------------------");
		
		
	}
	}
		
	

