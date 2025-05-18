package exception_handling;

import java.io.FileOutputStream;

public class TryWithResorse {

	//try(resource declare){}
	//catch(exception e){}
	public static void main(String[] args) {
		try(FileOutputStream f=new FileOutputStream("C:\\Users\\nikhil\\Documents\\resourse.txt")) {
			
			String str="welcome";
			byte array[]=str.getBytes();
			f.write(array);
			System.out.println("mesg send ");
		} catch (Exception e) {
			// TODO: handle exceptione
			System.out.println("exception handle");
		}
		
	}
}
