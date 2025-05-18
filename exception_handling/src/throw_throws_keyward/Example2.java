package throw_throws_keyward;

//throws use structure levale
//its only declare the exception
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example2 {

	public static void ReadTextFile() throws FileNotFoundException, IOException {
		// throws NullPointerException;
		File file = new File("C://Users//nikhil//Downloads//Advance%20Java%20Manual.pdf");
		FileInputStream in = new FileInputStream(file);
		in.available();
		System.out.println(in.read());

	}

	public static void main(String[] args) {
		try {
			ReadTextFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
