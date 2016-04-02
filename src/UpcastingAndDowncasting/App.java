package UpcastingAndDowncasting;

class Machine {
	
	public void start() {
		
		System.out.println("Machine Started.");
	}
}

class Camera extends Machine{
	
	@Override
	public void start() {
		
		System.out.println("Camera Started.");
	}
	
	public void snap() {
		
		System.out.println("Photo taken.");
	}
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting (Polymorphism) is safe!
		/*
		 * machine2 reference pointing to Camera Object
		 */
		Machine machine2 = camera1;
		
		machine2.start();
		/*
		 * not possible, since it depends on the type of reference (variable) to. Which decides what method we can call
		 */
		// machine2.snap();
		
		
		
		// Now take a Downcasting scenario
		//Machine machine3 = new Machine(); Gives java.lang.ClassCastException: 
		Machine machine3 = new Camera(); // This is Up Casting Only, which is used in the scenario of Down Casting 
		/*
		 * Type mismatch: cannot convert from Machine to Camera {Java need confirmation, as down casting is not safe}
		 */
		//Camera camera2 = machine3;
		
		// Work around (Downcasting)
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();

		// Doesn't work, we hava runtime exception: java.lang.ClassCastException
		Machine machine4 = new Machine();
		// Camera camera3 = (Camera)machine4;
		// camera3.start();
		// camera3.snap();
		
		
		
	}

}
