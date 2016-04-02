package SerializingArrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	
	
	public static void main(String[] args) {
		
		System.out.println("Writing Objects...");
		
		Person[] people = {new Person(543, "Mike"), new Person(123, "Joe"), new Person(343, "Bob") };
		
		/*
		 * Nice
		 */
		ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));
		
		// JAVA 7, Try with Resources. fs.close is called automatically
		try(FileOutputStream fs = new FileOutputStream("test.ser"); 
				ObjectOutputStream os = new ObjectOutputStream(fs)) { // .bin or any type of file
			
			// The Order used to write the objects, should be same when reading the objects
			
			// Serializing the Data to be saved
			/*
			 * Saving Arrays
			 */
			os.writeObject(people); // order => 1
			
			/*
			 * Saving Array Lists
			 */
			os.writeObject(peopleList);  // order => 2
			
			// for ArrayList
			os.writeInt(peopleList.size()); // order => 3
			
			for (Person person: peopleList) {  // order => 4
				
				os.writeObject(person);
			}
			
			// In Case of Arrays
			// os.writeInt(people.length);
			
			// Do not forget this
			// os.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
