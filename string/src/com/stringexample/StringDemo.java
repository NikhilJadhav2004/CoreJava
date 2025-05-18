package com.stringexample;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="core";
		s1.concat("java");
		System.out.println(s1);
		//not change s1 after calling(imutable)
		String s2=s1.concat("java");
		System.out.println(s2);
		String s3="nikhu";
		System.out.println(s1+s3);
		
		
		//String buffer and String buillder
		
		
		StringBuffer sb=new StringBuffer("adavance");
		sb.append("java1");
		//change sb after calling(mutable)
		System.out.println(sb);
		System.out.println("sb"+sb);
		System.out.println("append method:"+sb.append("java"));
	}
}
