package com.studant;

import java.lang.ProcessHandle.Info;

public class Univercity {

	public static void main(String[] args) {
		Collage c=new Collage();
		Studant s1=new Studant();
		Studant[] details=c.addinfostudant();
		
		for(Studant s:details) {
			System.out.println(s);
			//System.out.println(s1.toString());
		}
		
		
		
	}
}
