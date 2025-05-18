package com.Conroller;

import com.Service.Collage;
import com.model.AllStudent;
import com.model.Student;

public class Univercity {

	
	public static void showInfo(Student s) {
		
		System.out.println(s.id+" "+s.name+" "+s.city);
	}
	
	public static void ShowAll(AllStudent a) {
		System.out.println(a.vijay.id);
		System.out.println(a.vijay1.id);
		System.out.println(a.vijay2.id);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println(a.vijay.city);
		System.out.println(a.vijay1.city);
		System.out.println(a.vijay2.city);

	}
	
	public static void main(String[] args) {
		
		Collage c=new Collage();
		c.addStudent();
		c.AllStudentinfo();
		
		
		
		
	}
}
