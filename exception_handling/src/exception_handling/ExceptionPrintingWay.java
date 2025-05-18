package exception_handling;

public class ExceptionPrintingWay {

	//3 way to print exception
	//printstackTrace()//exception
	
	public static void main(String[] args) {
		try {
			System.out.println("try block");
			int a=10/0;
			System.out.println(a);
		} catch (Exception e) {
			//1st way
			e.printStackTrace();
			//2nd way
			//System.out.println(e.getMessage());
			//3rd way
			System.out.println(e.toString());
		}
	}
	
	
}
