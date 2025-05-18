package com.controller;

import com.model.Allemploye;
import com.service.Dept;

public class Company {
	public static void main(String[] args) {
		Dept sc = new Dept();
		Allemploye a = sc.show();
		System.out.println(a.a.eid + " " + a.a.name + " " + a.a.salary + " " + a.a.cname);
		System.out.println(a.b.eid + " " + a.b.name + " " + a.b.salary + " " + a.b.cname);

	}
}
