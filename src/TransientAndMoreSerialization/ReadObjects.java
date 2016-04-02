package TransientAndMoreSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

// De - serialization is done here
public class ReadObjects {
	
	
	public static void main(String[] args) {
		System.out.println("Reading Objects...");
		
		// Objects inside the "Try with Resources" are auto closable (JAVA 7)
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("testadv.ser"))) {
			
			Person person = (Person) os.readObject();
			System.out.println(person);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
