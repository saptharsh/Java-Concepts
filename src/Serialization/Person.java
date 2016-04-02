package Serialization;

import java.io.Serializable;

/*
 * Serialization: This is turning the java Object into binary form
 */

// In order to make an Object serializable, the Object Class should implement serializable 
public class Person implements Serializable {

	/**
	 * JVM uses this to check if it is reading the same Object which was written
	 */
	private static final long serialVersionUID = 7050691575509059637L;
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
