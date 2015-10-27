package constructors;

/*
 * A constructor is a special method which is run every time when we create an instance of the class
 */
class Machine{

	private String name;
	private int age;
	/*
	 * Method usually starts with a lower case letter
	 * But, a constructor should always start with an Upper case
	 */
	public Machine(){
		
		/*
		 * Calling another constructor from within a constructor
		 * This calling needs to be done at the beginning of any constructor
		 */
		this("sooper ranga", 51);
		
		System.out.println("First constructor running!!");
		
		//We often use constructors for initialization of private variables
		name = "Sappy hegde";
	}
	
	
	//A constructor accepting a string parameter
	public Machine(String name){
		
		this(name, 101);
		
		System.out.println("Second constructor running!!");
		this.name = name;
	}
	
	public Machine(String name, int age){
		
		System.out.println("Third constructor running!!");
		this.name = name;
		this.age = age;
	}
	
}

public class App {

	public static void main(String[] args) {
		
		/*
		 * Creating an instance of a class
		 * new Machine(); is sufficient to call he constructor
		 * The object is being returned to "machine1" 
		 */
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("ravi");

		Machine machine3 = new Machine("hegde", 27);
	}

}
