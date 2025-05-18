package com.overriding1;

public class SBI extends Bank {
	@Override
	public void name(String s) {
		System.out.println("Bank os sbi:"+s);
	}

	@Override
	public void rateofintrest(float f) {
		System.out.println("ROI of sbi:"+f);
	}
}
