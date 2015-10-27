package staticAndFinal;

public class Thing {

		
		/*
		 * All the variables declared in this class should be private/protected
		 */
		public final static int LUCKY_NUMBER = 7; /* JAVA constants */
		
		public String name;
		public String fullName;
		public static String description;
		//static can be used to keep a count on the number of objects we are creating
		public static int count = 0;
		
		//Instance variables in JAVA are assigned to default values
		public int id;
		
		//Constructor
		public Thing(){
			/*
			 * count is static and it belongs to the class, not to the objects.
			 * 	Which means, there is only ONE COUNT var which is shared between all objects 
			 */
			count++;
			
			//each object created will have unique id
			id = count;
		}
		
		/*
		 * Static methods versus instance methods.
		 * Note: Instance methods can access the static data
		 */
		public void showFullName(){
			System.out.println("Object id " + id + " full name: " + fullName); 
			System.out.println("called within instance method:"+ description);
		}
		
		//Static methods can access static data, because both belong to the class
		public static void showInfo(){
			System.out.println("Hello, I am static method");
			
			/*
			 * static methods can't access instance variables
			 * System.out.println(name);
			 */
			System.out.println("called within static method: "+description);
		}
		

}
