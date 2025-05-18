package exception_handling;

public class TrywithPipeOperator {

	public static void main(String[] args) {
		System.out.println("---main method---");
		try {
			System.out.println("---try block---");
			String s=args[1];
			System.out.println("value of s:"+s);//arrayIndexOutofBoundExecption
            int i=Integer.parseInt(s);
            System.out.println(i);
            int j= 10/i;
            System.out.println("value of j:"+j);//arithmatic exception
            String a=null;
            System.out.println(a.length());//nullpoint exception
            
		} catch (NumberFormatException   | ArithmeticException |NullPointerException e) {
			System.out.println("try block with pipe operator for handling the multiple exception");
			e.printStackTrace();
		
	}
}
}
