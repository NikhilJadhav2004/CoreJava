package lab_exception_handling;

public class Demo {

	public static void main(String[] args) {
		
		try {
			int a=20/0;
			System.out.println(a);
			
		} catch (Exception e) {
			
			System.out.println(e);
		}finally {
			System.out.println("finaly always exicute");
		}
		
		
	}
}
