package CreatingAndWritingTextFiles;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		File file = new File("createTest.txt");
		
		// Try with resources, it automatically closes the file
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {

			br.write("This is line 1");
			br.newLine();
			br.write("This is line 2");
			br.newLine();
			br.write("Last line...");
			
		} catch (IOException e) {

			System.out.println("Unable to read the file " + file.toString());
		}

	}

}
