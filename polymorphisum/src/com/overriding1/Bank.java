package com.overriding1;

public class Bank {
	//private,static,final method not override
    //acces modifire is same or grether
	//method name is same and parameter is always same
	public void name(String s) {
		System.out.println("Bank name:"+s);
	}
	public void rateofintrest(float f) {
		System.out.println("ROI:"+f);
	}
}
