package JavaPackages;

//Import from a package, inorder to use the Fish class
import JavaPackagesOcean.Fish;
import JavaPackagesOcean.Seaweed;

/*
 * Importing all class from the packages
 * import JavaPackagesOcean.*;
 */

/*
 * To add all the required imports by eclipse,
 * Right click -> source -> organize imports
 */
public class App {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		Seaweed seaweed = new Seaweed();
	}

}
