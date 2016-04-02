package EqualsMethod;

// Dot Equals
class Person {
	
	private int id;
	private String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * In order to compare two objects on fields, generate equals() and hashcode()
	 * 	using the parameters on which you want to compare
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
	
		return super.toString();
	}
}

public class App {

	public static void main(String[] args) {

		
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(8, "John");
		
		/*
		 * (==) Checking, If two references pointing at the same objects or not
		 */
		System.out.println("If two references pointing at the same objects or not "+ (person1 == person2));
		
		// Now
		person2 = person1;
		
		// Gives True
		System.out.println("If two references pointing at the same objects or not "+ (person1 == person2));
		
		
		Person person3 = new Person(4, "Sap");
		Person person4 = new Person(4, "Sap");
		
		// False, since these are 2 different objects
		/*
		 * Semantically (in Meaning) these are same, but in physical (Memory) they are different
		 */
		System.out.println("Semantically (in Meaning) these are same, but in physical (Memory) they are different "+ (person3 == person4));
		
		
		// Comparing in terms of meaning
		System.out.println("Comparing in terms of meaning, without over-riden equals we get False. But now, " +person3.equals(person4));
		
		
		// In the case of Non-Primitive Data Types
		Double value1 = 7.8;
		Double value2 = 7.8;
		
		System.out.println("In the case of Non-Primitive == doesn't work: "+ (value1 == value2));
		System.out.println("In the case of Non-Primitive .equals works: "+ value1.equals(value2));
		
		// In the case Primitive Types
		Integer number1 = 6;
		Integer number2 = 6;
		
		System.out.println("In the case of Primitives == works: "+ (number1 == number2));
		System.out.println("In the case of Primitive .equals works: "+ number1.equals(number2));
		
		
		// In the Case of Strings
		String text1 = "Hola";
		String text2 = "Hola";
		
		
		System.out.println("Comapring two strings with (==) "+ (text1==text2));
		
		
		String text3 = "Hola_Amigo".substring(0, 4);
		
		System.out.println("The Modified Hola.. "+ text3);
		
		System.out.println("Comparing 2 strings with the modified String: "+ (text1 == text3));
		
		System.out.println("Hence, use .equals for Comparing 2 strings (semantically): "+ text1.equals(text3));
		
		
		// Hashcodes (Literally the value returned by the above over-ridden Hashcode)
		System.out.println("The HashCode of an object is an unique ID which follows after the @ symbol: "+ new Object());
		
	}

}
