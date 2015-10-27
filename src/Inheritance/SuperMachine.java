package Inheritance;

public class SuperMachine {

	//can only be accessed within the class
	private String name ="I am a Super man";
	
	//Default: protected => can be accessed by a class within a package 
	String Fullname ="I am a Kaacha Man";
	
	public void start(){
		System.out.println("Machine started");
		
	}
	
	public void stop(){
		System.out.println("Machine stopped");
	}
	
}
