package Polymorphism;

/*
 * Polymorphism Definition:
 * 		If we have a Child Class of some Parent Class? Then, we could always use the Child Class instead of the 
 * 		Parent Class, to perform the same functionality as the Parent Class. 
 */
		
public class App {

	public static void doGrow(Plant plant){
		
		plant.grow();
	}
	
	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();

		//Plant plant2 = plant1;
		/*
		 * Above can be replaced by,
		 */
		Plant plant2 = tree; // This is Polymorphism
		
		plant2.grow(); // Plant2 "reference" is pointing at Tree Class
		
		/*
		 * This is not possible. Because, it also depends on type of the reference.
		 * 		That is, the type of the variable which decides what methods we can call.
		 */
		//plant2.shedLeaves();
		
		/*
		 * This is possible
		 */
		tree.shedLeaves();
		
		// Where ever parent class is expected, I can use the child class => POLYMORPHISM 
		doGrow(tree);
	}

}
