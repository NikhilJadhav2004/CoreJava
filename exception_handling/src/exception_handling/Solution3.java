package exception_handling;

public class Solution3 {

	public static void main(String[] args) {
		
		System.out.println("start");
		try {
			int a=10/0;
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
