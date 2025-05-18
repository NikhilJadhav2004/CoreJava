package com.overriding1;

public class ICCI extends Bank {

	@Override
	public void name(String s) {
		System.out.println("bank of icci:"+s);
	}
	@Override
	public void rateofintrest(float f) {
		System.out.println("Roi of icci"+f);
		
	}
	public static void main(String[] args) {
		//mix object
		Bank b=new SBI();
		b.name("SBI");
		b.rateofintrest(4.5f);
		Bank a=new Bank();
		a.name("ICCI");
		a.rateofintrest(6.6f);
	}
}
