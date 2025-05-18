package com.Service;

import com.Conroller.Univercity;
import com.model.AllStudent;
import com.model.Student;

public class Collage {

	
	public void addStudent() {
		
		Student a=new Student();
		
		a.id=132;
		a.name="om";
		a.city="pune";
		
//		/*
//		 * //
//		 */	
		Univercity u=new Univercity(); 
		u.showInfo(a);
	}
	
	public void AllStudentinfo() {
		
		AllStudent a=new AllStudent();
		
		a.vijay.id=1;
		a.vijay1.id=2;
		a.vijay2.id=89;
		
		Univercity u=new Univercity(); 
		u.ShowAll(a);
		
	}
}
