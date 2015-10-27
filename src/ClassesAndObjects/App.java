package ClassesAndObjects;

/*
 * Class is a Template or bluePrint for creating objects
 */
class Person{
	/*
	 * classes can contain
	 * 1. Data (Instance variables)
	 * 2. Subroutines (methods, like main() etc) 
	 */
	
	//Instance variables (data or 'state')
	String name;
	int age;
	
}

//If we make a class 'public,' then the .java file should have a name of the public class
public class App {

	public static void main(String[] args) {
	
		Person person1 = new Person();// An object of type person
		
		person1.name = "sappy";
		person1.age = 23;
		
		Person person2 = new Person();
		person2.name = "ravi";
		person2.age = 27;

		System.out.println(person1.name);
		
	}

}
