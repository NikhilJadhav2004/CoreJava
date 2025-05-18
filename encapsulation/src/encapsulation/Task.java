package encapsulation;

//  in encapsulation variables and method merge in single unit
//  essentail data hide from user then variable and class is private
//  it is produced using setter and getter files
//-variables are private then it is hidden from other clases and can be acess only throgh methods odf current class is called data hiding
public class Task {
	private int a;
	private String s;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	return a+" "+s;
	}
	
	
	
	public static void main(String[] args) {
		Task t=new Task();
		t.setA(80);
		t.setS("nikhil");	
		System.out.println(t.toString());
		
	}

}
