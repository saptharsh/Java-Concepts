package AccessSpecifiers;

/*
 * private: Only within Same Class
 * public: From anywhere
 * protected: same Class, Subclass, and Same package
 * no modifier: same package only
 */

/*
 * Only 2 scopes when it comes to the Classes
 */
// Visible only in this .java File
class something{
	
}

// Visible anywhere
public class App {

	public static void main(String[] args) {
		
		/* "plant" is reference to the Plant Class */
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		// Using the Class to access the static var, not a reference to it
		System.out.println(Plant.ID);
		
		/*
		 *  Can't access the "Type" var even here
		 */
		//System.out.println(plant.type);
		
		Field field = new Field();
		
	}

}
