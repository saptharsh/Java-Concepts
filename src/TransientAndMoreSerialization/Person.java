package TransientAndMoreSerialization;

import java.io.Serializable;

 
public class Person implements Serializable {

	// This is used to check if the serialization and de - serialization is being done on the same object
	private static final long serialVersionUID = 7050691575509059637L;
	
	// private int id;
	private transient int id; // transient => prevents the serialization of object's property. id takes in the default value
	private String name;

	// Static variables are not serializable. Because, Static field belongs to the class and not to Individual Objects.
	private static int count;

	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
	}
	
	
	
	
	
}
