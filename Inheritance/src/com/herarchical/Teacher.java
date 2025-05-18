package com.herarchical;

public class Teacher extends Collage {
	public void run() {
		System.out.println("teacher");
	}
	public static void main(String[] args) {
		Studant sc=new Studant();
		sc.show();
		sc.display();
		Teacher obj=new Teacher();
		obj.run();
		obj.display();
		
		
		
	}

}
