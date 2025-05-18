package paramertermethod2;

public class Test {
	public Studentinfo adddata(Studentinfo s) {
		System.out.println("---student information---");
		System.out.println(s.rollno+" "+s.name+" "+s.address);
		return s;
		
	}
	
	public void addinfo(Studentinfo s,Studentmark m) {
		System.out.println("----Student detalis and maraks-------");
		System.out.println(s.rollno+" "+s.name+" "+s.address);
		System.out.println(m.hsc+" "+m.cet);
		
	}
	public static void main(String[] args) {
		Studentinfo sc=new  Studentinfo();
		sc.rollno=45;
		sc.name="nikhil";
		sc.address="pune";
		Test t=new Test();
		t.adddata(sc);
		Studentinfo s=new  Studentinfo();
		s.rollno=49;
		s.name="abhi";
		s.address="pune";
		t.adddata(s);
		Studentmark o=new Studentmark();
		o.hsc=90.98;
		o.cet=98.99;
		t.addinfo(s, o);
	}

}
