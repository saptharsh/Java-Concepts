package ReadingFilesWithFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Lecture 47 continuation
public class App1 {

	public static void main(String[] args) {

		File file = new File("test.txt");

		// Try with resources, it automatically closes the file
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {

			System.out.println("Can't find the file "+ file.toString());
		} catch (IOException e) {

			System.out.println("Unable to read the file "+ file.toString());
		}
	}

}
