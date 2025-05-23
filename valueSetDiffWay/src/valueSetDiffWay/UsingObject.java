package valueSetDiffWay;

public class UsingObject {

	int id;
	String name;
	int mark;
	
	
	static String collage="jspm";
	
	void show() {
		
		System.out.println(id+" "+name+" "+mark+" "+collage);
	}
	
	public static void main(String[] args) {
		
		UsingObject om=new UsingObject();
		om.id=10;
		om.name="om";
		om.mark=99;	
		om.show();	
		System.out.println("-------------------------------------------");
		
		UsingObject om2=new UsingObject();
		om2.id=101;
		om2.name="om2";
		om2.mark=90;	
		om2.show();	
		System.out.println("-------------------------------------------");


	}

}
