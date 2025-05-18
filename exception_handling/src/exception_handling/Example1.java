package exception_handling;

public class Example1 {
	
	public static void main(String[] args) {
		
		 System.out.println("sarting code");
		 
		
		 
		 try {
			 Integer a=new Integer("abc");
			 System.out.println("value of a:"+a);
		 }finally {
			 System.out.println("finally");
			 System.out.println("ending the code");
		 }
		
	}

}
