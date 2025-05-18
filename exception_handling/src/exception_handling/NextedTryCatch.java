package exception_handling;

public class NextedTryCatch {
    public static void main(String[] args) {
		System.out.println("---main method---");
		
		try {
			String a=null;
			System.out.println(a.length());
			//by default jvm care the exception
		} finally {
			System.out.println("1st finally block");
		}
		try {
			System.out.println("---outer try block----");
			String s="abc";
			System.out.println(s.length());//nullpointerexception
			//arithmatic exception
			try {
				System.out.println("inner try block");
				int a=10/0;
				System.out.println("value of a:"+a);
				
			}catch (Exception e) {
				System.out.println("inner catch block");
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			System.out.println("outer catch block");
			e.printStackTrace();
		}finally {
			System.out.println("finaly block");
		}
		
		System.out.println("end main method");
	}
	
}
