package Default;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class CheckedExceptionRunner {
	
	public static void main(String[]arg) {
		
		File file = new File("bhanu");
		
		try {
			FileInputStream = new FileInputStram(file);
			
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
	}

}
