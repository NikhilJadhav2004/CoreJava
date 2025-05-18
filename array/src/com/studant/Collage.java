package com.studant;


public class Collage  {

	
	public Studant[] addinfostudant() {
		
		Studant s=new Studant();
		s.setId(78);
		s.setName("nihkil");
		s.setMark(90);
		s.setAddress("pune");
		
		Studant s1=new Studant();
		s1.setId(90);
		s1.setName("om");
		s1.setMark(100);
		s1.setAddress("satara");
		
		Studant s2=new Studant();
		s2.setId(90);
		s2.setName("om");
		s2.setMark(100);
		s2.setAddress("satara");
		
		Studant s3=new Studant();
		s3.setId(90);
		s3.setName("om");
		s3.setMark(100);
		s3.setAddress("satara");
		
		Studant[] info= {s,s1,s2,s3};
		
		
		
		
		return info;//s,s1
		
	}
	
	
	
}
