package Inheritance;


//Car is child class of SuperMachine, Car inherits from SuperMachine
public class Car extends SuperMachine{
 
	//Method over-riding
	/*
	public void start(){
		System.out.println("Car started");
		
	}
	*/
	
	//Better way of over-riding the methods
	/*
	 * Right click -> source -> Select, override/implement methods 
	 */
	
	
	
	public void wipeWindShield(){
		System.out.println("Wiping windshield!");
	}

	@Override
	public void start() {
		
		// Calling the parent class, method
		//super.start();
		System.out.println("Car started");
		
	}
	
	/*
	 * Over riding variables is not a good idea
	 */
	public void showInfo(){
		System.out.println("Super machine's local name: "+ Fullname);
	}
	
}


