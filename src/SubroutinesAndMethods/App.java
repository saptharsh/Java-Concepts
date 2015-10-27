package SubroutinesAndMethods;
/*
 * Class is a Template or bluePrint for creating objects
 * 		Should always start with Caps
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

	//methods should start with lower letter, 2nd and consecutive words should start with caps
	void speak(){
		//If the person is very is talkative
		for(int i = 0; i<3; i++){
			System.out.println("My name is: "+ name +" and I am "+ age +"years old");
		}
	}
	
	void sayHello(){
		System.out.println("Hellooooo...! by"+" "+name);
	}
}

//If we make a class 'public,' then the .java file should have a name of the public class
public class App {

	public static void main(String[] args) {
	
		Person person1 = new Person();// An object of type person
		
		person1.name = "sappy";
		person1.age = 23;
		/*
		 * same objects can call the methods any number of times
		 */
		person1.speak();
		
		Person person2 = new Person();
		person2.name = "ravi";
		person2.age = 27;
		person2.speak();
		person2.sayHello();
		//System.out.println("Name of Person1:"+person1.name);
		
	}

}

