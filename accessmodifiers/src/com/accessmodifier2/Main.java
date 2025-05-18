package com.accessmodifier2;

import com.accessmodifier.Publicmod;
//import com.accessmodifier.Default;
import com.accessmodifier.protectedmodfier;

public class Main extends protectedmodfier {
	public static void main(String[] args) {
		//Default a=new Default();
		//System.out.println(a.b);
		Main m=new Main();
		System.out.println(m.a);
		m.m1();
		Publicmod p=new Publicmod();
	//	System.out.println(p.a);
	//	p.m1();
		
	}

}
