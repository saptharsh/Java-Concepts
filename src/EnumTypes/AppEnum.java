package EnumTypes;

public class AppEnum {

	/*
	 * A Java Enum is a special Java type used to define collection of constants. 
	 * More precisely, a Java enum type is a special kind of Java class. 
	 * An enum can contain constants, methods etc. Java enums were added in Java 5
	 */
	public static void main(String[] args) {

		// Basic Usage of Enums (95 percent of the time we use Enums this way)
		animals animal = animals.CAT;
		
		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			break;
		default:
			break;
		
		}
		
		/*
		 * output from the below syso, without toString() in animals.java => Printing through syso: DOG
		 */
		// Over - riding toString() to create the user friendly version of Enum
		System.out.println("Printing through syso: "+ animals.DOG);
		
		// Turning Enum constant into String
		System.out.println("Enum name as a String: "+ animals.DOG.name());
		
		System.out.println("Getting Class info: "+ animals.DOG.getClass());
		
		System.out.println("Is animals.DOG a instance of Enum? "+ (animals.DOG instanceof Enum));
		
		System.out.println("Getting Name: "+ animals.MOUSE.getName());
		
		
		// valueOf() is a static method. Taking a String and converting it to Enum Constant
		animals animal2 = animals.valueOf("CAT");
		
		System.out.println("Enum value from toString: "+animal2);
	}

}
