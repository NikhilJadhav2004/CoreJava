package com.parametrised_constructor;
//ctrl-d-line  delete
//ctrl+shift+o---unused import delete
//ctrl+o--class info
//ctrl+t===parent class show
//ctrl+/===comment all
//search+file--find class any pakage
//ctrl+shift+r----resource
//cntrl+shift+l---shotcut

public class main {
	public static void main(String[] args) {
		Studant sc=new Studant(56, "nihkil", "pune", 90, 0, 'a');
		System.out.println(sc.id);
		System.out.println(sc.name);
		System.out.println(sc.address);
		System.out.println(sc.mark);
		System.out.println(sc.grade);
		System.out.println(sc.contact);
     
		Studant s2 = new Studant(25,"ram","satara",80,907618741,'o');
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address);
		System.out.println(s2.mark);
		System.out.println(s2.grade);
		System.out.println(s2.contact);

}
}
