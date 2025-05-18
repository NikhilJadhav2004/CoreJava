package exception_handling;

public class Solution1 {

	public static void main(String[] args) {
		
		System.out.println("starting code");
		try {
			Integer a=new Integer("ab");
			 System.out.println("value of a:"+a);
			 System.out.println("-----------");
			 }
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 
		System.out.println("ending the code");
	}
}
