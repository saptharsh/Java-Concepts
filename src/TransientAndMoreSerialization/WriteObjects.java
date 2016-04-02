package TransientAndMoreSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writing Objects...");
		
		// JAVA 7, Try with Resources. fs.close is called automatically
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("testadv.ser"))) { 
			
			Person person = new Person(7, "Sappy");
			
			// use Class to access the static var
			Person.setCount(343);
			
			os.writeObject(person);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
