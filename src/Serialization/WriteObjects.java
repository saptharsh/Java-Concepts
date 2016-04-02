package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	
	
	public static void main(String[] args) {
		
		System.out.println("Writing Objects...");
		
		Person mike = new Person(543, "Mike");
		Person joe = new Person(123, "Joe");
		
		System.out.println(mike);
		System.out.println(joe);
		
		// JAVA 7, Try with Resources. fs.close is called automatically
		try(FileOutputStream fs = new FileOutputStream("people.bin")) { // .bin or any type of file
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			// Serializing the data and saving it in a file
			os.writeObject(mike);
			os.writeObject(joe);
			
			// Do not forget this
			os.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
