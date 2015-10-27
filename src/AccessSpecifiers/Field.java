package AccessSpecifiers;

public class Field {
	
	private Plant plant = new Plant();

	public Field() {
		
		// This works, as Scope of "size" var is protected and Field class is inside the package
		System.out.println("Field Class accessing the Plant Class's size var: "+plant.Size);
	}
	
	

}
