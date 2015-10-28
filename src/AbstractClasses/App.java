package AbstractClasses;

public class App {

	public static void main(String[] args) {

		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		/* There is no use by creating any general Machine. Hence make the Machine Class abstract */
		// This making a Class abstract, the instantiation of the Class is avoided
		// Machine machine1 = new Machine();
		
		// Calling Parent Class's run()
		car1.run();
	}

}
