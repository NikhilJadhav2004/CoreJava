package exception_handling;

public class TrywithmultipleCatch {

	//jdk1.6-multiple catch----..>>>jdk 1.7 try with pipe(|)operator
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
            
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound handle");
			e.printStackTrace();
			
		}catch (ArithmeticException e) {
			System.out.println("arithmatic handle");
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("null point exception handle");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
