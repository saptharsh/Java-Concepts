package ReadingTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

												/* Second Way  */
	public static void main(String[] args) throws FileNotFoundException {

		/* Declaring path on Windows */
		//String fileName = "C:\\Users\\smart\\Desktop\\example.txt";

		/* Copy and past the file in core-java project folder */ 
		String fileName ="example.txt";
		/* Declaring path on other systems */
		//String fileName = "C:/Users/smart/Desktop/example.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		System.out.println("The interger value read: "+ value);
		
		// Avoiding the First line, which is giving number of lines info in the text file
		in.nextLine();
		int count = 1;
		
		while (in.hasNextLine()) {
			
			String line = in.nextLine();
			
			System.out.println(count + ": "+line);
			count++;
		}
		
		
		in.close();
		
		/* One Way
		try {
			Scanner in = new Scanner(textFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		*/
	}

}
