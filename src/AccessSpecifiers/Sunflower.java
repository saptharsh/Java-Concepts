package AccessSpecifiers;

public class Sunflower extends Plant {

	public Sunflower() {
	
		/*
		 * won't work, Since "Type is private"
		 */
		//type = "flower";
		
		/*
		 * It works, as size is protected. Since, Sunflower is sub-class of Plant
		 */
		this.Size ="small";
		this.height = 15;
	}

	
}
