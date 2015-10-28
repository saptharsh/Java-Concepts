package ReadingFilesWithFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Slightly older way (JAVA 6)
public class App {

	public static void main(String[] args) {

		File file = new File("test.txt");
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line;
			
			while( (line = br.readLine()) != null) {
				
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
		
			// In order to help the End users. Avoiding using e.printStackTrace();
			System.out.println("File not found: "+ file.toString());
		} catch (IOException e) {

			System.out.println("Unable to read file: "+ file.toString());
		} finally{

			// Closing br is necessary
			try {
				br.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
		
	}

}
