package PassingByValue;

public class App {

	// In Java everything is Pass by value. Where, the var "value" here holds the copy of data sent from main()
	public void show(int value) {
		
		System.out.println("2. Value is: "+ value);
		
		value = 8;
		
		System.out.println("3. Value is: "+ value);
	}
	
	// Method Overloading
	public void show(Person person) {
		
		System.out.println("2. Person is: "+ person);
		
		// The name of the object's reference in the main() is changed from this 
		// person.setName("Joe");
		
		person = new Person("Jason");
		
		// The name of the object's reference "Jason" is changed from this 
		// person.setName("Joe");
		
		System.out.println("3. Person is: "+ person);
	}
	
	public static void main(String[] args) {

		App app = new App();
		
		//=============================================
		/* Passing Primitive Types by value */
		int value = 7;
		System.out.println("1. Value is: "+ value);
		
		app.show(7);
		
		// Very Important
		System.out.println("4. Value is: "+ value);
		
		//=============================================
		/* Passing Non - Primitive Person Type by value */
		
		Person person = new Person("Bob");
		System.out.println("1. Person is: "+ person);
		
		app.show(person);
		
		// Very Important
		System.out.println("4. Person is: "+ person);
	}

}
