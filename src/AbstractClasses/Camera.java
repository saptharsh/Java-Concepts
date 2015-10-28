package AbstractClasses;

//We get the following message after making the method Start() abstract in the Machine Class
/*
* The type Car must implement the inherited abstract method Machine.Start()
*/
//Very much like using an interface
/*
 * But, a Class can have many interface. Where as, it can extend only one related parent abstract class
 * Furthermore, we can have certain implementations in the parent Abstract Class. But, in the interfaces, we
 * 		cannot have any implementations. It is completely up to the implementing Class of the interface
 * If we extend Abstract Class? the child class has the fundamental identity of the parent class
 */
public class Camera extends Machine{

	@Override
	public void Start() {

		System.out.println("Starting Camera..");
		
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShutDown() {
		// TODO Auto-generated method stub
		
	}

}
