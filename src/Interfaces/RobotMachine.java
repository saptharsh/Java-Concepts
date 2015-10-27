package Interfaces;

public class RobotMachine implements Info {
	
	private int id = 7;
	
	public void start(){
		System.out.println("Rogot's machine strared");
		
	}

	/*
	 * Implements interface will force the class to have to all the methods of the interface
	 */
	public void showInfo() {

		System.out.println("Robot's machine id is "+ id);
		
	}

}
