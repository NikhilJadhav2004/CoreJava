package lab_exception_handling;

public class Demo2 {
	//in 1.6 java version-try block with multiple catch block
	//in 1.7 java haveing try with pipe(|) operator to perform multiple exception
	public static void main(String[] args) {
		//convert the int to string -->>use string.valueof()
		long num=120l;
		String s=String.valueOf(num);
		System.out.println("s");
		//convert string to int..-->>use integer parseint()
		String p="123";
		int a=Integer.parseInt(p);
		System.out.println(a);
		try {
			int []arr=new int[3];
			arr[4]=20;//array index out of bound
			System.out.println(arr[4]);
			
			int t=10/0;//arithmatic exception
			String w="123abc";//number format exception
			int r=Integer.parseInt(w);
			System.out.println(r);
			
			
		} catch (NumberFormatException e) {
			System.out.println("number format exception handle");
		}catch (ArithmeticException e) {
			System.out.println("arithmatic exception");
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.exit(0);
			System.out.println("finally block");
		}
		System.out.println("end of code");
	}
}
