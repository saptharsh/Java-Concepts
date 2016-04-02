package SerializingArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	
	
	public static void main(String[] args) {
		System.out.println("Reading Objects...");
		
		// Objects inside the "Try with Resources" are auto closable (JAVA 7)
		try(FileInputStream fi = new FileInputStream("test.ser"); 
				ObjectInputStream os = new ObjectInputStream(fi)) {
			
			// Reading array of objects
			Person[] people = (Person[]) os.readObject();
			
			// Reading arrayList of objects
			/*
			 * Type cannot be checked when we are retrieving form ArrayList. Hence, we get a Warning
			 */
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>) os.readObject();
			
			// The Order used to write the objects, should be same when reading the objects
			
			System.out.println("Getting the person object through Arrays");
			
			for(Person person: people) { // order => 1
				
				System.out.println(person);
			}
			
			System.out.println("Getting the person object through ArrayList");
			
			for(Person person: peopleList) { // order => 2
				
				System.out.println(person);
			}
			
			int num = os.readInt(); // order => 3 
			
			System.out.println("Getting the person object through ArrayList "
								+ "written on to the file differently, to avoid the warning");
			
			for (int i = 0; i < num; i++) {
				
				Person person = (Person) os.readObject();
				System.out.println(person);
			}
			
			// CLosing the Opened Stream, not required
			// os.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
