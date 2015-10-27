package AccessSpecifiers1;

import AccessSpecifiers.Plant;

public class Grass extends Plant{

	public Grass() {
		
		/*
		 * height is not accessible, even though Grass extends Plant. 
		 * 		Since, the Grass is in different package and has a DEFAULT protected scope. (NO-MODIFIER)
		 */
		//System.out.println(this.height);
		
		/*
		 * But, if the Scope of a member variable is specifically mentioned as PROTECTED? 
		 * 		Then, it can be accessible by subclasses in the different package
		 */
		System.out.println(this.Size);
		/*
		 * PUBLIC
		 */
		System.out.println(this.name);
	}

	
	public static void main(String[] args){
		
		Grass gras = new Grass();
	}
}







