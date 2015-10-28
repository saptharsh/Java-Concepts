package AnonymousClass;

class Machine{
	
	public void Start(){
		
		System.out.println("Staring Machine...");
	}
}

interface Plant {
	
	public void grow();
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine() {
			
			// This is Anonymous Class, which is a Child Class of Machine
			@Override
			public void Start(){
				System.out.println("It making a lot of sound");
			}
		};
		
		machine1.Start();

		Plant plant1 = new Plant() {
			
			@Override
			public void grow() {

				System.out.println("Plant Growing...");
				
			}
		};
		
		// Calling the Method of the Anonymous Class ABOVE, which is implementing Plant interface
		plant1.grow();
	}

}
