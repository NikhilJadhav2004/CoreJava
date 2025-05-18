package exception_handling;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println("start");
		try {
			
			String s=args[0];
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
