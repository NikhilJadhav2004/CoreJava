package com.stringexample;

public class Test {
	public static void main(String[] args) {

	String s="Hi i am Nikhil   ";
	System.out.println(s);
	//trim();
	System.out.println(s.trim());
	//toupper and lower case();
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	//length();
	System.out.println(s.length());
	//to chararray()
	char []arrayofchar=s.toCharArray();
	for(char i:arrayofchar) {
		System.out.println(i);
	}
	//split()-in parathisis we have to pass the spliting condition
	String []arrayofstring=s.split(" ");
	for(String p:arrayofstring) {
		System.out.println(p);
	}
	String s1="a::b::c::";
	String []array=s1.split("::",2);
	for(String q:array) {
		System.out.println(q);
	}
	//charat();
	System.out.println(s.charAt(10));
	//index of()
	System.out.println(s.indexOf('H'));
	
	//Replace()
	String s2=s.replace('N', 'n');
	System.out.println(s2);
	//replaceall()
	String s3=s.replaceAll("Nikhil", "om");
	System.out.println(s3);
	//concatination()
	String s4="nikhil";
	String s5="jadhav";
	System.out.println(s4.concat(s5));
	System.out.println(s4+s5);
	//isempty();
	String s6=" ";
	System.out.println(s4.isEmpty());
	System.out.println(s6.isEmpty());
	//emutability concept-String class and 
	
	//substring()
	
	System.out.println(s5.substring(1));//adhav
	System.out.println(s5.substring(1,5));//dha
	
	//contains-boolean data type method
	String a="nikhiljadhav";
	System.out.println(a.contains("nikhil"));
	
	//valueof()
	
	int p=78;
	 
	String p1=String.valueOf(p+22);
	System.out.println(p1);
	
	
	
	
	
	
	
	}
}
