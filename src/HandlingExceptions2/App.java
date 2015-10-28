package HandlingExceptions2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void openFile() throws FileNotFoundException{

		File file = new File("test.txt");

		FileReader fr = new FileReader(file);

		
	}
	
	public static void main(String[] args) {

		try {
			openFile();
		} catch (FileNotFoundException e) {
		
			//e.printStackTrace();
			/* Recommended to give a message */
			System.out.println("Could not open file");
			
		}

	}

}
