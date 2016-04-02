package InnerClasses;

//We can have as many classes as we want in this .java file. But, name of the .java file should correspond to One Public Class
public class Robot {

	private int id;

	// Inner Class accessing instance data
	private class Brain {
		// Non static Inner classes are used when we have to group certain functionality
		
		public void think() {
			System.out.println("Robot "+ id +" is thinking..");
		}
	}
	
	// Static classes are used when we just want a normal class which is not associated with the instance vars of the outer class 
	public static class Battery {
		
		 public void charge() {
			 
			 System.out.println("Battery charging.. can't access id as it is not a static var");
		 }
	}
	
	public Robot(int id) {

		this.id = id;
	}
	
	public void start() {
		
		System.out.println("Starting robot "+ id);
		
		Brain brain = new Brain();
		brain.think();
		
		
		String name = "Robert";
		
		// Can declare classes even within methods
		// Can't declare this private, public or protected. The scope is just within the method start().
		class Temp {
			public void doSomething() {
				System.out.println("ID is "+ id);
				System.out.println("My name is "+ name);
			}
		}
		
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	
}
